package com.cos.blogStudy.controller.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cos.blogStudy.dto.ResponseDto;
import com.cos.blogStudy.model.RoleType;
import com.cos.blogStudy.model.User;
import com.cos.blogStudy.service.UserService;

@RestController
public class UserApiController {

	// IOC
	@Autowired
	private UserService userService;
	
	@PostMapping("/api/user")
	public ResponseDto<Integer> save(@RequestBody User user) { // username, password, email
		System.out.println("UserApiController 호출");
		
		// 실제로 DB에 insert를 하고 아래에서 return이 되는지 확인하기!
		int result = userService.회원가입(user);
		
		// 강제로 데이터 주입
		user.setRole(RoleType.USER);
		
		return new ResponseDto<Integer>(HttpStatus.OK, result);
		
		// 자바 오브젝트를 JSON으로 변환해서 리턴 --> Jackson

	}
}
