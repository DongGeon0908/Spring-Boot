package com.cos.blogStudy.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cos.blogStudy.model.User;
import com.cos.blogStudy.repository.UserRepository;

// 스프링이 컴포넌트 스캔을 통해서 Bean에 등록 진행 -> IOC
@Service
public class UserService {

	@Autowired
	private UserRepository userRepository;

	// 하나의 트랜잭션으로 작동!
	@Transactional
	public void 회원가입(User user) {
		userRepository.save(user);
	}

	// 하나의 트랜잭션으로 작동!
	@Transactional(readOnly = true) // select할 때 트랜잭션 시작, 서비스 종료시에 트랜잭션 종료 --> 정합성 지킴
	public User 로그인(User user) {
		return userRepository.findByUsernameAndPassword(user.getUsername(), user.getPassword());
	}
}
