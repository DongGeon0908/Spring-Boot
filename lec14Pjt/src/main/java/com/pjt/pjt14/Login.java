package com.pjt.pjt14;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class Login {
	
	// 사용자의 요청을 받음
	//@RequestMapping(value = "/login", method = RequestMethod.GET)
	@RequestMapping("/login") // get방식은 위의 문법을 생략할 수 있음
	public String login(Model model) { // Model은 데이터를 담는 그릇
			
		model.addAttribute("loginKey", "loginValue");
		
		return "login";
	}
	
}

