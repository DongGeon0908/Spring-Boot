package com.cos.blogStudy.handler;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;

import com.cos.blogStudy.dto.ResponseDto;

@ControllerAdvice // 모든 예외처리를 받음
@RestController
public class GlobalExceptionHandler {
	
	// 해당 예외가 발생했을시 적용됨
	@ExceptionHandler(value=Exception.class)
	public ResponseDto<String> handleArgumentException(Exception e) {
		return new ResponseDto<String>(HttpStatus.INTERNAL_SERVER_ERROR.value(), e.getMessage()); // 500 에러
	}
}
