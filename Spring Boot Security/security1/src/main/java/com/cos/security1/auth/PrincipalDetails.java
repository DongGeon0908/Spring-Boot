package com.cos.security1.auth;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Map;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.oauth2.core.user.OAuth2User;

import com.cos.security1.model.User;

import lombok.Data;

// 시큐리티가 /login 주소 요청이 오면 낚아채서 로그인 진행
// 로그인을 진행이 완료가 되면 시큐리티 session을 만듬 (Security contextHolder)
// 오브젝트 => Authentication 타입 객체
// Authentication 안에 User 정보가 있어야 함
// User 오브젝트 타입 => UserDetails 타입 객체

// Security Session => Authentication => UserDetails

@Data
public class PrincipalDetails implements UserDetails, OAuth2User {

	private User user; // 콤포지션
	private Map<String, Object> attributes;

	// 일반 로그인 생성자
	public PrincipalDetails(User user) {
		this.user = user;
	}

	// OAuth 로그인 생성자
	public PrincipalDetails(User user, Map<String, Object> attributes) {
		this.user = user;
		this.attributes = attributes;
	}

	// 해당 User의 권한을 리턴하는 곳!!
	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
		// TODO Auto-generated method stub
		Collection<GrantedAuthority> collect = new ArrayList<>();
		collect.add(new GrantedAuthority() {
			@Override
			public String getAuthority() {
				return user.getRole();
			}
		});
		return collect;
	}

	@Override
	public String getPassword() {
		// TODO Auto-generated method stub
		return user.getPassword();
	}

	@Override
	public String getUsername() {
		// TODO Auto-generated method stub
		return user.getUsername();
	}

	@Override
	public boolean isAccountNonExpired() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean isAccountNonLocked() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean isCredentialsNonExpired() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean isEnabled() {
		// TODO Auto-generated method stub

		// 우리 사이트! 1년동안 회원이 로그인을 안하면 휴먼계정으로 변환
		// 현재시간 - 로그인시간 => 1년 초과하면 return false; 로 지정

		return true;
	}

	@Override
	public Map<String, Object> getAttributes() {
		// TODO Auto-generated method stub
		return attributes;
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return null;
	}

}
