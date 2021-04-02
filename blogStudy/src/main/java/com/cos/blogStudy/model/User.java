package com.cos.blogStudy.model;

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

/* ORM이란
 * JAVA 등의 언어 Object - > 테이블로 매핑해주는 기술 
 */

// @Getter
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity // User 클래스를 읽어서 Mysql에 자동으로 테이블을 생성
// @DynamicInsert -> null 값을 제외하고 insert 진행
public class User {

	@Id // Primary key 등록
	@GeneratedValue(strategy = GenerationType.IDENTITY) // 프로젝트에서 연결된 데이터베이스의 넘버링 전략
	private int id; // auto-increment

	@Column(nullable = false, length = 100, unique = true)
	private String username; // ID

	@Column(nullable = false, length = 100) // 해쉬값이 들어가서 길이가 길어야함
	private String password;

	@Column(nullable = false, length = 50)
	private String email;

	// @ColumnDefault("'user'")
	@Enumerated(EnumType.STRING) // DB에 해당 타입이 없기 때문에
	private RoleType role; // 추후 Enum으로 바꾸기*-*-0

	// kakao, goole 등
	private String oauth;

	@CreationTimestamp // 시간이 자동으로 입력되도록 하는 어노테이션
	private Timestamp createDate;
}
