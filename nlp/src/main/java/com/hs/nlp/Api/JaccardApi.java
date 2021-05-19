package com.hs.nlp.Api;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class JaccardApi {
    public double solution(String A, String B) {

        WiseNLUApi wiseNLUApi = new WiseNLUApi();

        A = A.toLowerCase();
        B = B.toLowerCase();

        Map<String, Integer> tmp1 = wiseNLUApi.WiseNLU(A);
        Map<String, Integer> tmp2 = wiseNLUApi.WiseNLU(B);

        Map<String, Integer> union = new HashMap<>();

        ArrayList<String> multiSet1 = new ArrayList<>();
        ArrayList<String> multiSet2 = new ArrayList<>();
        ArrayList<String> intersection = new ArrayList<>();

        for (String s : tmp1.keySet()) {
            multiSet1.add(s);
            union.put(s, 1);
        }
        for (String s : tmp2.keySet()) {
            multiSet2.add(s);
            union.put(s, 1);
        }

        Collections.sort(multiSet1);
        Collections.sort(multiSet2);
        for (String s : multiSet1) {
            if (multiSet2.remove(s)) {
                intersection.add(s);
            }
        }

        double jakard = 0;

        if (union.size() == 0) {
            jakard = 1;
        } else {
            jakard = (double) intersection.size() / (double) union.size();
        }

        return Math.round(jakard*10000)/10000.0;
    }
}
