package com.cos.security1.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.annotation.Secured;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.cos.security1.model.User;
import com.cos.security1.repository.UserRepository;

@Controller // View를 리턴해줌
public class IndexController {

	@Autowired
	private UserRepository userRepository;

	@Autowired
	private BCryptPasswordEncoder bCryptPasswordEncoder;

	// localhost:8080/
	// localhost:8080
	@GetMapping({ "", "/" })
	public String index() {
		// 머스테치 템플릿 엔진을 사용 - 기본적으로 스프링이 권장함
		// 머스테치 기본폴더 src/main/resources/
		// 뷰리졸버 설정 : templates (prefix), mustache (suffix) --> 생략가능
		return "index"; // src/main/resources/templates/index.mustache 기본 경로
	}

	@GetMapping("/user")
	public @ResponseBody String user() {
		return "user";
	}

	@GetMapping("/admin")
	public @ResponseBody String admin() {
		return "admin";
	}

	@GetMapping("/manager")
	public @ResponseBody String manager() {
		return "manager";
	}

	// 스프링 시큐리티가 해당 주소를 낚아채버림 - SecurityConfig 파일 생성 후 작동안함
	@GetMapping("/loginForm")
	public String loginForm() {
		return "loginForm";
	}

	@GetMapping("/joinForm")
	public String joinForm() {
		return "joinForm";
	}

	@PostMapping("/join")
	public String join(User user) {
		System.out.println(user);
		user.setRole("ROLE_USER");
		String rawPassword = user.getPassword();
		String encPassword = bCryptPasswordEncoder.encode(rawPassword);
		user.setPassword(encPassword);
		userRepository.save(user); // 회원가입 잘됨, 비밀번호 : 1234 => 시큐리티로 로그인할 수 없음. >> 패스워드가 암호화가 안되었기 때문
		return "redirect:/loginForm";
	}

	// 권한을 하나 정의
	@Secured("ROLE_ADMIN") // 계정 권한을 설정하는 것!
	@GetMapping("/info")
	public @ResponseBody String info() {
		return "개인정보";
	}
	
	// N개의 권한을 정의
	@PreAuthorize("hasRole('ROLE_MANAGER') or hasRole('ROLE_ADMIN')")
	@GetMapping("/data")
	public @ResponseBody String data() {
		return "데이터정보";
	}
	

}