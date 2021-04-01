package com.cos.blogStudy.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cos.blogStudy.model.Board;
import com.cos.blogStudy.model.User;


// DAO
// 기본적은 CRUD 설정
// 자동으로 bean 등록
// @Repository //--> 생략 가능
public interface BoardRepository extends JpaRepository<Board, Integer>{
	
}
