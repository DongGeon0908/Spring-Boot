package com.cos.blogStudy.test;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DummyControllerTest {

	// http://localhost:8000/blog/dummy/join (요청)
	// http의 body에 username, password, email 데이터를 가지고 (요청)
	// key-value의 방식으로 데이터를 받음
	@PostMapping("/dummy/join")
	public String join(String username, String password, String email) {
		System.out.println("username : " + username);
		System.out.println("password : " + password);
		System.out.println("email : " + email);
		
		
		return"회원가입 완료";
	}
}
