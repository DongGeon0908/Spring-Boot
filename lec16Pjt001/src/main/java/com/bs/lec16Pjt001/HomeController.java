package com.bs.lec16Pjt001;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

	@RequestMapping("/")
	public String home(Model model) {
		
		System.out.println("--- home method ---");
		
		model.addAttribute("key", "value");
		
		return "home";
	}
	
	@RequestMapping("/login")
	public String login(Model model) {
		
		System.out.println("--- login method ---");
		
		model.addAttribute("key", "value");
		
		return "login";
	}
}
