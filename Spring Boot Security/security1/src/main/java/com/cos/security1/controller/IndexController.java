package com.cos.security1.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller // View를 리턴해줌
public class IndexController {
	
	// localhost:8080/
	// localhost:8080
	@GetMapping({ "", "/" })
	public String index() {
		// 머스테치 템플릿 엔진을 사용 - 기본적으로 스프링이 권장함
		// 머스테치 기본폴더 src/main/resources/
		// 뷰리졸버 설정 : templates (prefix), mustache (suffix) --> 생략가능
		return "index"; // src/main/resources/templates/index.mustache 기본 경로
	}
}