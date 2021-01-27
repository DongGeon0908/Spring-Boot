package com.cos.blog.model;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

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
//@DynamicInsert // null값인 필드를 제외하고 insert 진행
public class User {

	@Id // Primary key
	@GeneratedValue(strategy = GenerationType.IDENTITY) // 프로젝트에서 연결된 DB의 넘버링 전략을 따라감
	private int id; // auto_increment

	@Column(nullable = false, length = 30, unique = true)
	private String username; // id

	@Column(nullable = false, length = 100) // 입력된 값을 해쉬로 변환
	private String password; // pw

	@Column(nullable = false, length = 50)
	private String email; // email

	// @ColumnDefault("'user'")
	// private String role; // Enum을 쓰는게 좋음 --> 권한을 줄때 domain(범위)을 설정할 수 있음 //
	// ADMIN, USER

	// DB는 RoleType이라는게 없다
	@Enumerated(EnumType.STRING)
	private RoleType role; // Enum을 쓰는게 좋음 --> 권한을 줄때 domain(범위)을 설정할 수 있음 // ADMIN, USER

	// 로그인을 진행한 사용자가 어떤 방식을 사용했는지 확인 // kakao, google, baisc login...
	private String oauth;
	
	// 내가 직접 시간을 넣으려면 Timestamp.valueOf(LocalDateTime.now())
	@CreationTimestamp // 시간이 자동 입력
	private Timestamp createDate;
}
