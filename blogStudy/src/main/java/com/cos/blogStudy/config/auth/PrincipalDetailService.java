package com.cos.blogStudy.config.auth;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.cos.blogStudy.model.User;
import com.cos.blogStudy.repository.UserRepository;

@Service
public class PrincipalDetailService implements UserDetailsService{

	@Autowired
	private UserRepository userRepository;
	
	/* 스프링이 로그인 요청을 가로챌 때, username, password 변수 2개를 가로챔
	 * password 부분 처리는 알아서 함
	 * username이 DB에 있는지 확인해주면 됨
	 */
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		// TODO Auto-generated method stub
		User principal = userRepository.findByUsername(username)
				.orElseThrow(()->{
					return new UsernameNotFoundException("해당 사용자를 찾을 수 없음 : " + username);
				});
		
		return new PrincipalDetail(principal); // 시큐리티의 세션에 유저 정보가 저장됨, user, password
	}

}
