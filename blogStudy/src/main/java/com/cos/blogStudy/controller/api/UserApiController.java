package com.cos.blogStudy.controller.api;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cos.blogStudy.dto.ResponseDto;
import com.cos.blogStudy.model.User;

@RestController
public class UserApiController {

	@PostMapping("/api/user")
	public ResponseDto<Integer> save(@RequestBody User user) {
		System.out.println("UserApiController 호출");
		
		// 실제로 DB에 insert를 하고 아래에서 return이 되는지 확인하기!
		return new ResponseDto<Integer>(HttpStatus.OK, 1);
		
		// 자바 오브젝트를 JSON으로 변환해서 리턴 --> Jackson

	}
}
