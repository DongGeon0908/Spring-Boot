package com.cos.blog.model;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

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
@Entity // Reply 클래스가 Mysql에 테이블이 생성이 된다.
public class Reply {
	@Id // Primary Key
	@GeneratedValue(strategy = GenerationType.IDENTITY) // 프로젝트에서 연결된 DB의 넘버링 전략을 따라감
	private int id; // 시퀀스, auto-increment

	@Column(nullable = false, length = 200)
	private String content;

	@ManyToOne // 하나의 게시글에 여러개의 답변이 등록될 수 있음
	@JoinColumn(name = "boardId")
	private Board board;

	@ManyToOne // 여러개의 답변을 한명의 유저가 작성할 수 있음
	@JoinColumn(name = "userId")
	private User user;

	// 내가 직접 시간을 넣으려면 Timestamp.valueOf(LocalDateTime.now())
	@CreationTimestamp // 시간이 자동 입력
	private Timestamp createDate;
}
