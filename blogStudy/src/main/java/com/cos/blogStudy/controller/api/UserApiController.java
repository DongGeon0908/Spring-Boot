package com.cos.blogStudy.controller.api;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.core.context.SecurityContext;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cos.blogStudy.config.auth.PrincipalDetail;
import com.cos.blogStudy.dto.ResponseDto;
import com.cos.blogStudy.model.User;
import com.cos.blogStudy.service.UserService;



@RestController
public class UserApiController {

	// IOC
	@Autowired
	private UserService userService;

	@Autowired
	private AuthenticationManager authenticationManager;
	
	@PostMapping("/auth/joinProc")
	public ResponseDto<Integer> save(@RequestBody User user) { // username, password, email
		System.out.println("UserApiController 호출");


		// 실제로 DB에 insert를 하고 아래에서 return이 되는지 확인하기!
		userService.회원가입(user);

		return new ResponseDto<Integer>(HttpStatus.OK.value(), 1);

		// 자바 오브젝트를 JSON으로 변환해서 리턴 --> Jackson

	}
	
	// key = value, x-www-from-urlencoded
	@PutMapping("/user")
	public ResponseDto<Integer> update(@RequestBody User user){
		userService.회원수정(user);
		
		// 세션 등록
		Authentication authentication = authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(user.getUsername(), user.getPassword()));
		SecurityContextHolder.getContext().setAuthentication(authentication);
		
		
		return new ResponseDto<Integer>(HttpStatus.OK.value(), 1);
	}

	
//	// 전통적인 방식의 로그인 방법
//	@PostMapping("/api/user/login")
//	public ResponseDto<Integer> login(@RequestBody User user, HttpSession session) {
//		System.out.println("UserApiController : login 호출됨");
//		User principal = userService.로그인(user); // principal = 접근주체
//
//		if (principal != null) {
//			session.setAttribute("principal", principal);
//		}
//		return new ResponseDto<Integer>(HttpStatus.OK.value(), 1);
//	}
	
}
