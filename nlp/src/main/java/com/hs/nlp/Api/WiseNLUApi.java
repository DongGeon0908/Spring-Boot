package com.hs.nlp.Api;

import com.google.gson.Gson;

import java.io.*;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.*;

public class WiseNLUApi {
	static public class Morpheme {
		final String text;
		final String type;
		Integer count;

		public Morpheme(String text, String type, Integer count) {
			this.text = text;
			this.type = type;
			this.count = count;
		}
	}

	static public class NameEntity {
		final String text;
		final String type;
		Integer count;

		public NameEntity(String text, String type, Integer count) {
			this.text = text;
			this.type = type;
			this.count = count;
		}
	}

	// String -> Map<String, Integer>로 반환
	static public TreeMap<String, Integer> WiseNLU(String text) {

		// 그릇을 담기!
		TreeMap<String, Integer> data = new TreeMap<String, Integer>();

		// 언어 분석 기술 문어/구어 중 한가지만 선택해 사용
		// 언어 분석 기술(문어)
		String openApiURL = "http://aiopen.etri.re.kr:8000/WiseNLU";

		// 언어 분석 기술(구어)
		// String openApiURL = "http://aiopen.etri.re.kr:8000/WiseNLU_spoken";

		String accessKey = "34e1d871-d35a-4cb0-825f-26908159b85f"; // 발급받은 API Key
		String analysisCode = "ner"; // 언어 분석 코드

		// 형태소 분석 (문어/구어) : "morp",
		// 어휘의미 분석 (동음이의어 분석)(문어) : "wsd"
		// 어휘의미 분석 (다의어 분석)(문어) : "wsd_poly"
		// 개체명 인식 (문어/구어) : "ner" -- O
		// 의존 구문 분석 (문어) : "dparse" -- O
		// 의미역 인식 (문어) : "srl" -- O

		Gson gson = new Gson();

		// 언어 분석 기술(문어)

		Map<String, Object> request = new HashMap<>();
		Map<String, String> argument = new HashMap<>();

		argument.put("analysis_code", analysisCode);
		argument.put("text", text);

		request.put("access_key", accessKey);
		request.put("argument", argument);

		URL url;
		Integer responseCode = null;
		String responBodyJson = null;
		Map<String, Object> responeBody = null;

		try {
			url = new URL(openApiURL);
			HttpURLConnection con = (HttpURLConnection) url.openConnection();
			con.setRequestMethod("POST");
			con.setDoOutput(true);

			DataOutputStream wr = new DataOutputStream(con.getOutputStream());
			wr.write(gson.toJson(request).getBytes("UTF-8"));
			wr.flush();
			wr.close();

			responseCode = con.getResponseCode();
			InputStream is = con.getInputStream();
			BufferedReader br = new BufferedReader(new InputStreamReader(is));
			StringBuffer sb = new StringBuffer();

			String inputLine = "";
			while ((inputLine = br.readLine()) != null) {
				sb.append(inputLine);
			}
			responBodyJson = sb.toString();

			// http 요청 오류 시 처리
			if (responseCode != 200) {
				// 오류 내용 출력
				//System.out.println("[error] " + responBodyJson);
				return data;
			}

			responeBody = gson.fromJson(responBodyJson, Map.class);
			Integer result = ((Double) responeBody.get("result")).intValue();
			Map<String, Object> returnObject;
			List<Map> sentences;

			// 분석 요청 오류 시 처리
			if (result != 0) {

				// 오류 내용 출력
				//System.out.println("[error] " + responeBody.get("result"));
				return data;
			}

			// 분석 결과 활용
			returnObject = (Map<String, Object>) responeBody.get("return_object");
			sentences = (List<Map>) returnObject.get("sentence");

			Map<String, Morpheme> morphemesMap = new HashMap<String, Morpheme>();
			Map<String, NameEntity> nameEntitiesMap = new HashMap<String, NameEntity>();
			List<Morpheme> morphemes = null;
			List<NameEntity> nameEntities = null;

			for (Map<String, Object> sentence : sentences) {
				// 형태소 분석기 결과 수집 및 정렬
				List<Map<String, Object>> morphologicalAnalysisResult = (List<Map<String, Object>>) sentence
						.get("morp");
				for (Map<String, Object> morphemeInfo : morphologicalAnalysisResult) {
					String lemma = (String) morphemeInfo.get("lemma");
					Morpheme morpheme = morphemesMap.get(lemma);
					if (morpheme == null) {
						morpheme = new Morpheme(lemma, (String) morphemeInfo.get("type"), 1);
						morphemesMap.put(lemma, morpheme);
					} else {
						morpheme.count = morpheme.count + 1;
					}
				}

				// 개체명 분석 결과 수집 및 정렬
				List<Map<String, Object>> nameEntityRecognitionResult = (List<Map<String, Object>>) sentence.get("NE");
				for (Map<String, Object> nameEntityInfo : nameEntityRecognitionResult) {
					String name = (String) nameEntityInfo.get("text");
					NameEntity nameEntity = nameEntitiesMap.get(name);
					if (nameEntity == null) {
						nameEntity = new NameEntity(name, (String) nameEntityInfo.get("type"), 1);
						nameEntitiesMap.put(name, nameEntity);
					} else {
						nameEntity.count = nameEntity.count + 1;
					}
				}
			}

			if (0 < morphemesMap.size()) {
				morphemes = new ArrayList<Morpheme>(morphemesMap.values());
				morphemes.sort((morpheme1, morpheme2) -> {
					return morpheme2.count - morpheme1.count;
				});
			}

			if (0 < nameEntitiesMap.size()) {
				nameEntities = new ArrayList<NameEntity>(nameEntitiesMap.values());
				nameEntities.sort((nameEntity1, nameEntity2) -> {
					return nameEntity2.count - nameEntity1.count;
				});
			}

			// 형태소들 중 명사들에 대해서 많이 노출된 순으로 출력 ( 최대 10개 )
			if (morphemes != null) {
				morphemes.stream().filter(morpheme -> {
					return morpheme.type.equals("NNG") || morpheme.type.equals("NNP") || morpheme.type.equals("NNB");
				}).forEach(morpheme -> {
					String k = morpheme.text;
					int v = morpheme.count;
					data.put(k, v);
					//System.out.println("형태소 분석 : " + k + " " + v);
				});
			}

			// 형태소들 중 동사들에 대해서 많이 노출된 순으로 출력 ( 최대 10개 )
			if (morphemes != null) {
				morphemes.stream().filter(morpheme -> {
					return morpheme.type.equals("VV");
				}).forEach(morpheme -> {
					String k = morpheme.text;
					int v = morpheme.count;
					data.put(k, v);
					//System.out.println("형태소 분석 : " + k + " " + v);
				});
			}
			if (nameEntities != null) {
				// 인식된 개채명들 많이 노출된 순으로 출력 ( 최대 10개 )
				nameEntities.stream().forEach(nameEntity -> {
					String k = nameEntity.text;
					int v = nameEntity.count;
					data.put(k, v);
					//System.out.println("형태소 분석 : " + k + " " + v);
				});
			}

			String[] tmp = text.split(" ");
			for (int i = 0; i < tmp.length; i++) {
				if (!data.containsKey(tmp[i])) {
					data.put(tmp[i], 0);
				}
			}

		} catch (MalformedURLException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

		return data;
	}

}