package com.cos.blogStudy.service;

import java.security.Principal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cos.blogStudy.model.RoleType;
import com.cos.blogStudy.model.User;
import com.cos.blogStudy.repository.UserRepository;

// 스프링이 컴포넌트 스캔을 통해서 Bean에 등록 진행 -> IOC
@Service
public class UserService {

	@Autowired
	private UserRepository userRepository;

	@Autowired
	private BCryptPasswordEncoder encoder;

	// 하나의 트랜잭션으로 작동!
	@Transactional
	public int 회원가입(User user) {
		String rawPassword = user.getPassword(); // 원문
		String encPassword = encoder.encode(rawPassword);
		user.setPassword(encPassword);
		user.setRole(RoleType.USER);
		try {
			userRepository.save(user);
			return 1;
		} catch (Exception e) {
			return -1;
		}

	}

	@Transactional
	public void 회원수정(User user) {

		// 수정시에는 영속성 컨텍스트 User 오브젝트를 영속화시키고, 영속화된 User 오브젝트를 수정
		// select를 해서 User 오브젝트를 DB로부터 가져오는 이뉴는 영속화를 위해!
		// 영속화된 오브젝트를 변경하면 자동으로 DB에 update문을 날림
		User persistance = userRepository.findById(user.getId()).orElseThrow(() -> {
			return new IllegalArgumentException("회원 찾기 실패");
		});

		// Validate 체크 ==>> 카카오 회원가입한 사용자는 개인정보 수정 불가
		if (persistance.getOauth() == null || persistance.getOauth().equals("")) {
			String rawPassword = user.getPassword();
			String encPassword = encoder.encode(rawPassword);
			persistance.setPassword(encPassword);
			persistance.setEmail(user.getEmail());
		}

		// 회원수정 함수 종료 = 서비스 종료 = 트랜잭션 종료 = commit 자동 진행 = 영속화된 persistance 객체의 변화가 감지되면
		// 더터체킹이 되어 update문 진행

	}

	@Transactional(readOnly = true)
	public User 회원찾기(String username) {

		User user = userRepository.findByUsername(username).orElseGet(() -> {
			return new User();
		});

		return user;
	}

	// 하나의 트랜잭션으로 작동!
	// @Transactional(readOnly = true) // select할 때 트랜잭션 시작, 서비스 종료시에 트랜잭션 종료 -->
	// 정합성 지킴
	// public User 로그인(User user) {
	// return userRepository.findByUsernameAndPassword(user.getUsername(),
	// user.getPassword());
	// }
}
