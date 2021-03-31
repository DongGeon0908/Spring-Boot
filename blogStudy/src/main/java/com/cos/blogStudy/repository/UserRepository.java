package com.cos.blogStudy.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cos.blogStudy.model.User;


// DAO
// 기본적은 CRUD 설정
// 자동으로 bean 등록
// @Repository //--> 생략 가능
public interface UserRepository extends JpaRepository<User, Integer>{
	
	// select * from user where username = ?
	Optional<User> findByUsername(String username);
	
	
	// JPA Naming 전략
	// select * from user where username =? and password = ?;
	// User findByUsernameAndPassword(String username, String password);	
	/* 위의 코드와 같은 기능
	 * @Query(value = "select * from user where username =? and password = ?", nativeQuery=true)
	 * User login(String username, String password); 
	 * */
}
