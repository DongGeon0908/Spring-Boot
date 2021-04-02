package com.cos.blogStudy.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import com.cos.blogStudy.config.auth.PrincipalDetailService;

// 빈 등록 : 스프링 컨테이너에서 객체를 관리할 수 있게 하는 것

// 밑의 3개의 어노테이션은 SpringSecurity의 기본
@Configuration // 빈등록 IOC관리
@EnableWebSecurity // 시큐리티 필터가 등록됨
@EnableGlobalMethodSecurity(prePostEnabled = true) //  특정 주소로 접근을 하면 권한 및 인증을 미리 체크
public class SecurityConfig extends WebSecurityConfigurerAdapter{
	
	@Autowired
	private PrincipalDetailService principalDetailService;
	
	@Bean
	@Override
	public AuthenticationManager authenticationManagerBean() throws Exception {
		return super.authenticationManagerBean();
	}
	
	
	@Bean  // IOC // Hash encoding
	public BCryptPasswordEncoder encodePWD() {
		return new BCryptPasswordEncoder();
	}
	
	/* 시큐리티가 대신 로그인해주는데 password로 가로채기를 하는데
	 * 해당 password가 뭘로 해쉬가 되어 회원가입이 되었는지 알아야
	 * 같은 해쉬로 암호화해서 DB에 있는 해쉬랑 비교할 수 있음a
	 */
	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		auth.userDetailsService(principalDetailService).passwordEncoder(encodePWD());
	}
	
	
	// 권한 설정
	@Override
	protected void configure(HttpSecurity http) throws Exception {
		http
			.csrf().disable() // csrf 토큰 비활성화 -> 테스트시 걸어두기!!
			.authorizeRequests()
				.antMatchers("/","/auth/**","/js/**","/css/**","/image/**","/dummy/**")
				.permitAll()
				.anyRequest()
				.authenticated()
			.and()
				.formLogin()
				.loginPage("/auth/loginForm")
				.loginProcessingUrl("/auth/loginProc") // 스프링 시큐리티가 해당 주소를 가로채서 대신 로그인 진행
				.defaultSuccessUrl("/");
		// .failureUrl("#"); --> 로그인 실패시 이동
	}
}
