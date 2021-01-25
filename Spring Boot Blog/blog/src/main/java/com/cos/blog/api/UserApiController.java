package com.cos.blog.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cos.blog.dto.ResponseDto;
import com.cos.blog.model.RoleType;
import com.cos.blog.model.User;
import com.cos.blog.service.UserService;

@RestController
public class UserApiController {

	@Autowired
	private UserService userService;

	@PostMapping("/api/user")
	public ResponseDto<Integer> save(@RequestBody User user) { // username, password, email
		System.out.println("User ApiController : save 호출됨");

		// 실제로 DB에 insert를 하고 아래에서 return이 됨
		user.setRole(RoleType.USER);
		userService.회원가입(user);
		return new ResponseDto<Integer>(HttpStatus.OK.value(), 1); // 자바오브젝트를 json으로 변환해서 리턴 (JACKSON)
	}

	/*
	 * // 전통적인 로그인 방식
	 * 
	 * @PostMapping("/api/user/login") public ResponseDto<Integer>
	 * login(@RequestBody User user, HttpSession session) {
	 * System.out.println("UserApiController : login 호출됨"); User principal =
	 * userService.로그인(user); // principal (접근 주체)
	 * 
	 * if (principal != null) { session.setAttribute("principal", principal); }
	 * 
	 * return new ResponseDto<Integer>(HttpStatus.OK.value(), 1); // 자바오브젝트를 json으로
	 * 변환해서 리턴 (JACKSON) }
	 */
}
