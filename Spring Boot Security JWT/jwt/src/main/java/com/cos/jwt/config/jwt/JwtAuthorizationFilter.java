package com.cos.jwt.config.jwt;

import java.io.IOException;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.web.authentication.www.BasicAuthenticationFilter;

import com.auth0.jwt.JWT;
import com.auth0.jwt.algorithms.Algorithm;
import com.cos.jwt.config.auth.PrincipalDetails;
import com.cos.jwt.model.User;
import com.cos.jwt.repository.UserRepository;

// 시큐리티가 filter를 가지고 있는데 그 필터중에 BasicAuthenticationFilter라는 것이 존재
// 권한이나 인증이 필요한 특정 주소를 요청했을 때 위 필터를 무조건 거침
// 만약 권한이 인증이 필요한 주소가 아니라면 해당 필터를 거치지 않음
public class JwtAuthorizationFilter extends BasicAuthenticationFilter {

	private UserRepository userRepository;

	public JwtAuthorizationFilter(AuthenticationManager authenticationManager, UserRepository userRepository) {
		super(authenticationManager);

	}

	@Override
	protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		// TODO Auto-generated method stub
		System.out.println("인증이나 권한이 필요한 요청");

		String jwtHeader = request.getHeader("Authorization");
		System.out.println("jwtHeader : " + jwtHeader);

		// JWT 토큰을 검증을 해서 정상적인 사용자인지 확인
		if (jwtHeader == null || !jwtHeader.startsWith("Bearer")) {
			chain.doFilter(request, response);
			return;
		}

		// JWT 토큰을 검증을 해서 정상적인 사용자인지 확인
		String jwttoken = request.getHeader("Authorization").replace("Bearer ", "");

		String username = JWT.require(Algorithm.HMAC512("cos")).build().verify(jwttoken).getClaim("username")
				.asString();

		// 서명이 정상적으로 됨
		if (username != null) {
			User userEntity = userRepository.findByUsername(username);
		
			PrincipalDetails principalDetails = new PrincipalDetails(userEntity);
			
			// JWT 토큰 서명을 통해서 서명이 정상이면 Authentication 객체를 만들어줌
			Authentication authentication =
					new UsernamePasswordAuthenticationToken(principalDetails, null, principalDetails.getAuthorities());
		
			// 강제로 시큐리티의 세션에 접근해 Authentication 객체를 저장
			SecurityContextHolder.getContext().setAuthentication(authentication);
			
			chain.doFilter(request, response);
		}

	}
}
