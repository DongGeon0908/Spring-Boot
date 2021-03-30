package com.cos.blogStudy.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

// 빈 등록 : 스프링 컨테이너에서 객체를 관리할 수 있게 하는 것

// 밑의 3개의 어노테이션은 SpringSecurity의 기본
@Configuration // 빈등록 IOC관리
@EnableWebSecurity // 시큐리티 필터가 등록됨
@EnableGlobalMethodSecurity(prePostEnabled = true) //  특정 주소로 접근을 하면 권한 및 인증을 미리 체크
public class SecurityConfig extends WebSecurityConfigurerAdapter{
	
	// 권한 설정
	@Override
	protected void configure(HttpSecurity http) throws Exception {
		http
			.authorizeRequests()
				.antMatchers("/auth/**")
				.permitAll()
				.anyRequest()
				.authenticated()
			.and()
				.formLogin()
				.loginPage("/auth/loginForm");
	}
}
