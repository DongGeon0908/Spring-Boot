package com.cos.blog.test;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TempControllerTest {
	
	//http://localhost:8000/blog/temp/home
	@GetMapping("/temp/home")
	public String tempHome() {
		System.out.println("tempHome()");
		
		// 파일리턴 기본 경로 : src/main/resources/static
		// 리턴면 : /home.html으로 해야 찾을 수 있음
		// 전체 경로 : src/main/resources/static/home.html
		
		return "/home.html";
	}
	
	//http://localhost:8000/blog/temp/img
	@GetMapping("/temp/img")
	public String tempImg() {
		return "/p1.png";
	}
	
	//http://localhost:8000/blog/temp/jsp
	@GetMapping("/temp/jsp")
	public String tempJsp() {
		// prefix : /WEB-INF/views/
		// suffix : .jsp
		// 전체 경로 : /WEB-INF/views/test.jsp
		
		return "test";
	}
}
