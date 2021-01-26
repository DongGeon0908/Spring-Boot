package com.cos.blog.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.cos.blog.service.BoardService;

@Controller
public class BoardController {

	
	@Autowired
	private BoardService boardService;
	
	@GetMapping({ "", "/" })
	public String index(Model model) { 
		// /WEB-INF/views/index.jsp
		model.addAttribute("boards", boardService.글목록());
		return "index"; //viewResolver 작동!! 해당 인덱스 페이지에 model 정보를 갖고 감
	}

	// USER 권한이 필요
	@GetMapping("/board/saveForm")
	public String saveForm() {
		return "board/saveForm";
	}

}
