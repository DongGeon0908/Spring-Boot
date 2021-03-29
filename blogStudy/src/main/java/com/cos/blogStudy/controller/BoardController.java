package com.cos.blogStudy.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class BoardController {
	
	// /WEB-INF/views/index.jsp
	@GetMapping({ "", "/" })
	public String index() {
		return "index";
	}
}
