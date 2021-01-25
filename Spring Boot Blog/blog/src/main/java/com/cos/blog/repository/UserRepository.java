package com.cos.blog.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cos.blog.model.User;

// DAO
// 자동으로 bean 등록됨
// @Repository 생략 가능
public interface UserRepository extends JpaRepository<User, Integer> {
	// JPA Naming 쿼리/전략
	// select * from user where username = ? and password = ?;
	// User findByUsernameAndPassword(String username, String password);

// User findByUsernameAndPassword(String username, String password); 와 동일한 기능 제공	 
//	@Query(value = "select * from user where username =? and password = ?", nativeQuery = true)
//	User login(String username, String password);
}
