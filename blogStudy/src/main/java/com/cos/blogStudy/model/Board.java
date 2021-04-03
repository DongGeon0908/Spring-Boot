package com.cos.blogStudy.model;

import java.sql.Timestamp;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OrderBy;

import org.hibernate.annotations.ColumnDefault;
import org.hibernate.annotations.CreationTimestamp;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
public class Board {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY) // auto_increment
	private int id;
	
	@Column(nullable = false, length = 100)
	private String title;
	
	@Lob // 대용량 데이터
	private String content; // 섬머노트 라이브러리 사용

	private int count; // 조회수
	
	@ManyToOne(fetch = FetchType.EAGER) // Many -> Board && User -> One
	@JoinColumn(name="userId")
	private User user; // JPA에서는 DB와 다르게 오브젝트를 저장할 수 있음
	
	@OneToMany(mappedBy = "board", fetch = FetchType.EAGER, cascade = CascadeType.REMOVE) // 연관관계의 주인이 아니다. -> FK가 아니다 -> DB에 컬럼을 만들지 않음
	@JsonIgnoreProperties({"board"}) // 무한 참조를 막는 방법!!
	@OrderBy("id desc") // 정렬
	private List<Reply> replys;
	
	@CreationTimestamp
	private Timestamp createDate;
}
