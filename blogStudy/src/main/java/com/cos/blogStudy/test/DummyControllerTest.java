package com.cos.blogStudy.test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cos.blogStudy.model.RoleType;
import com.cos.blogStudy.model.User;
import com.cos.blogStudy.repository.UserRepository;

@RestController
public class DummyControllerTest {
	
	@Autowired // 의존성 주입
	private UserRepository UserRepository;

	// http://localhost:8000/blog/dummy/join (요청)
	// http의 body에 username, password, email 데이터를 가지고 (요청)
	// key-value의 방식으로 데이터를 받음, 오브젝트로 받을 수 있음
	@PostMapping("/dummy/join")
	public String join(User user) {
		System.out.println("id : " + user.getId());
		System.out.println("username : " + user.getUsername());
		System.out.println("password : " + user.getPassword());
		System.out.println("email : " + user.getEmail());
		System.out.println("createDate : " + user.getCreateDate());
		
		user.setRole(RoleType.USER);
		UserRepository.save(user);
		return "회원가입 완료";
	}
}
