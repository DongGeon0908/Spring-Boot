package com.cos.jwt.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;
import org.springframework.web.filter.CorsFilter;

@Configuration
public class CorsConfig {

	@Bean
	public CorsFilter corsFilter() {
		UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource();
		CorsConfiguration config = new CorsConfiguration();
		config.setAllowCredentials(true); // 내 서버가 응답을 할 때 json을 자바스크립트에서 처리할 수 있게 할지를 선정하는 것
		config.addAllowedOrigin("*"); // 모든 IP에 응답을 허용
		config.addAllowedHeader("*"); // 모든 Header에 응답을 허용
		config.addAllowedMethod("*"); // 모든 post, put, delete, patch 요청을 허용
		config.addAllowedMethod("*");
		source.registerCorsConfiguration("/api/**", config);
		return new CorsFilter(source);
	}
}
