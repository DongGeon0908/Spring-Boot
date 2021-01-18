package com.cos.blog.model;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;

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
public class Board {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY) // auto-increment
	private int id;

	@Column(nullable = false, length = 100)
	private String title;

	@Lob // 대용량 데이터
	private String content; // 섬모노트 라이브러리 -> 작성된 데이터가 <html> 태그가 섞여서 디자인됨

	@ColumnDefault("0")
	private int count; // 조회수

	@ManyToOne // Many = Board, User = One -> 한명의 유저는 다양한 게시글을 작성할 수 있음, 연관관계 설정
	@JoinColumn(name = "userId")
	private User userId; // 데이터베이스에는 오브젝트 저장 불가, FK, 자바는 오브젝트 저장 가능

	@CreationTimestamp // 시간이 자동 입력
	private Timestamp createDate;
}
