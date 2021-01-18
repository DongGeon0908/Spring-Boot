package com.cos.blog.model;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.hibernate.annotations.ColumnDefault;
import org.hibernate.annotations.CreationTimestamp;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data // getter-setter
@NoArgsConstructor // bean 생성자
@AllArgsConstructor // 전체 생성자
@Builder // 빌더 패턴
//ORM -> JAVA(다른언어) Object -> 테이블로 매핑해주는 기술
@Entity // User 클래스가 Mysql에 테이블이 생성이 된다.
public class User {

	@Id // Primary key
	@GeneratedValue(strategy = GenerationType.IDENTITY) // 프로젝트에서 연결된 DB의 넘버링 전략을 따라감
	private int id; // auto_increment

	@Column(nullable = false, length = 30)
	private String username; // id

	@Column(nullable = false, length = 100) // 입력된 값을 해쉬로 변환
	private String password; // pw

	@Column(nullable = false, length = 50)
	private String email; // email

	@ColumnDefault("'user'")
	private String role; // Enum을 쓰는게 좋음 --> 권한을 줄때 domain(범위)을 설정할 수 있음

	@CreationTimestamp // 시간이 자동 입력
	private Timestamp createDate;
}
