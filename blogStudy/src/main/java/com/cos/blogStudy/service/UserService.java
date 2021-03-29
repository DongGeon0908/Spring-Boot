package com.cos.blogStudy.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cos.blogStudy.model.User;
import com.cos.blogStudy.repository.UserRepository;

// 스프링이 컴포넌트 스캔을 통해서 Bean에 등록 진행 -> IOC
@Service
public class UserService {
	
	@Autowired
	private UserRepository userRepository;
	
	// 하나의 트랜잭션으로 작동!
	@Transactional
	public int 회원가입(User user) {
		try {
			userRepository.save(user);
			return 1;
		} catch(Exception e) {
			e.printStackTrace();
			System.out.println("UserService : 회원가입() " + e.getMessage());
		}
		return -1;
	}
}
