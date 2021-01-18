package com.cos.blog.test;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

// 사용자가 요청한 내용에 대한 응답(HTML)
// @Controller

// 컨트롤러는 사용자가 요청한 내용에 대한 응답(Data) 제공
@RestController
public class HttpControllerTest {

	private static final String Tag = "HttpControllerTest : ";

	// http://localhost:8000/blog/http/lombok (select)
	@GetMapping("/http/lombok")
	public String lombokTest() {
		Member m = Member.builder().username("오한얼").password("1234").email("wrjssmjdhappy@naver.com").build();
		System.out.println(Tag + "getter : " + m.getUsername());
		m.setUsername("오한한한");
		System.out.println(Tag + "setter : " + m.getUsername());
		return "lombok test 완료";
	}

	// 인터넷 브라우저 요청은 무조건 get요청만 가능!
	// http://localhost:8000/blog/http/get (select)
	@GetMapping("/http/get") // 스프링에서 MessageConverter를 통해 데이터를 자동으로 받음
	public String getTest(@RequestBody Member m) { // http://localhost:8080/http/get?id=4&username=fuc1k&password=fuck&email=wrjs@naver.com
		return "get 요청 : " + m.getId() + " , " + m.getUsername() + " , " + m.getPassword() + " , " + m.getEmail();
	}

	// http://localhost:8000/blog/http/post (insert)
	@PostMapping("/http/post") // application/json
	public String postTest(@RequestBody Member m) { // 스프링에서 MessageConverter를 통해 데이터를 자동으로 받음
		return "post 요청 : " + m.getId() + " , " + m.getUsername() + " , " + m.getPassword() + " , " + m.getEmail();
	}

//	public String postTest(@RequestBody String text) { 
//		return "post 요청 : " + text
//	}
// text plain	

	// http://localhost:8000/blog/http/put (update)
	@PutMapping("/http/put")
	public String putTest() {
		return "put 요청";
	}

	// http://localhost:8000/blog/http/delete (delete)
	@DeleteMapping("/http/delete")
	public String deleteTest() {
		return "delete 요청";
	}
}
