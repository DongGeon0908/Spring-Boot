package com.benjamin.blog.springboot;

// 메인 클래스

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@EnableJpaAuditing // JPA Auditing 활성화 -> Spring Data JPA에서 시간에 대해서 자동으로 값을 넣어주는 기능
@SpringBootApplication // 스프링 부트의 자동 설정, 스프링 Bean 읽기와 생성을 모두 자동으로 설정
public class Application {
    public static void main(String[] args){
       SpringApplication.run(Application.class, args);
    }
}
