package com.cos.blogStudy.test;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

// 특저정 어노테이션이 붙어 있는 클래스 파일들을 new해서 IOC 스프링 컨테이너에 관리
@RestController 
public class BlogControllerTest { 
	
	@GetMapping("test/hello")
	public String hello() {
		return "<h1>hello Spring Boot</h1>";
	}
}