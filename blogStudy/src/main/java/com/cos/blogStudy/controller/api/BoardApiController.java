package com.cos.blogStudy.controller.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cos.blogStudy.config.auth.PrincipalDetail;
import com.cos.blogStudy.dto.ResponseDto;
import com.cos.blogStudy.model.Board;
import com.cos.blogStudy.model.User;
import com.cos.blogStudy.service.BoardService;
import com.cos.blogStudy.service.UserService;



@RestController
public class BoardApiController {
	
	@Autowired
	private BoardService boardService;
	
	@PostMapping("/api/board")
	public ResponseDto<Integer> save(@RequestBody Board board, @AuthenticationPrincipal PrincipalDetail principal) { 
		boardService.글쓰기(board, principal.getUser());
		
		return new ResponseDto<Integer>(HttpStatus.OK.value(), 1);

		// 자바 오브젝트를 JSON으로 변환해서 리턴 --> Jackson

	}

	
}
