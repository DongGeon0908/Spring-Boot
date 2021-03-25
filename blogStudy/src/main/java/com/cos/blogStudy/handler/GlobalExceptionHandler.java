package com.cos.blogStudy.handler;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;

@ControllerAdvice // 모든 예외처리를 받음
@RestController
public class GlobalExceptionHandler {
	
	// 해당 예외가 발생했을시 적용됨
	@ExceptionHandler(value=Exception.class)
	public String handleArgumentException(IllegalArgumentException e) {
		return "<h1>" +e.getMessage() + "</h1>";
	}
}
