package com.cos.blogStudy.test;

import java.util.function.Supplier;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cos.blogStudy.model.RoleType;
import com.cos.blogStudy.model.User;
import com.cos.blogStudy.repository.UserRepository;


// html 파일이 아닌, data를 리턴해주는 것이 Restcontroller!!!
@RestController
public class DummyControllerTest {
	
	@Autowired // 의존성 주입
	private UserRepository UserRepository;

	// {id} 주소로 파라미터를 전달 받음
	// http://localhost:8000/blog/dummy/user/3
	@GetMapping("/dummy/user/{id}")
	public User detail(@PathVariable int id) {
		/* user/4를 찾으면 내가 데이터베이스에서 못찾아오게 되면 user가 null이됨
		 * 그러면 return null이 리턴됨 -> 프로그램 문제 발생
		 * 결론적으로
		 * Optional로 User 객체를 감싸서 가져와서 null인지 파단하고 return
		 */
		
		
		User user = UserRepository.findById(id).orElseThrow(new Supplier<IllegalArgumentException>() {

			@Override
			public IllegalArgumentException get() {
				// TODO Auto-generated method stub
				return new IllegalArgumentException("해당 유저는 없음 id : " + id);
			}
			
		});
		
		
// 위의 코드를 람다식으로 간단하게 바꿀 수 있음
//		User user = UserRepository.findById(id).orElseThrow(()->{
//			return new IllegalArgumentException("해당 유저는 없음 id : " + id);
//			
//		});
		
		// 웹브라우저가 요청을 진행
		// user 객체 <- 자바 오브젝트
		// 변환 : 웹 브라우저가 이해할 수 있는 데이터 
		// 예전에는 json을 Gson으로 변환해서 사용
		// SpringBoot에서는 Messageconverter를 통해서 응답시 자동 작동
		// 만약에 자바 오브젝트를 리턴하게 되면 Messageconverter가 Jackson라이브러리를 호출해서 User 오브젝트를 Json으로 변환해서 웹으로 보냄
		return user;
		
	}
	
	// http://localhost:8000/blog/dummy/join (요청)
	// http의 body에 username, password, email 데이터를 가지고 (요청)
	// key-value의 방식으로 데이터를 받음, 오브젝트로 받을 수 있음
	@PostMapping("/dummy/join")
	public String join(User user) {
		System.out.println("id : " + user.getId());
		System.out.println("username : " + user.getUsername());
		System.out.println("password : " + user.getPassword());
		System.out.println("email : " + user.getEmail());
		System.out.println("createDate : " + user.getCreateDate());
		
		user.setRole(RoleType.USER);
		UserRepository.save(user);
		return "회원가입 완료";
	}
}
