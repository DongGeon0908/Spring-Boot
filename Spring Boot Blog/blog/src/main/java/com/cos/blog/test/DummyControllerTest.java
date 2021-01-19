package com.cos.blog.test;

import java.util.List;
import java.util.function.Supplier;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.web.PageableDefault;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cos.blog.model.RoleType;
import com.cos.blog.model.User;
import com.cos.blog.repository.UserRepository;

// html파일이 아니라 data를 리턴해주는 controller = RestController
@RestController
public class DummyControllerTest {

	@Autowired // 의존성 주입
	private UserRepository userRepository;

	// http://localhost:8000/blog/dummy/users
	@GetMapping("/dummy/users")
	public List<User> list() {
		return userRepository.findAll();
	}

	// 한페이지당 2건에 데이터를 리턴받아 볼 예정
	// http://localhost:8000/blog/dummy/user
	@GetMapping("/dummy/user")
	public List<User> pageList(@PageableDefault(size=2, sort="id", direction = Sort.Direction.DESC) Pageable pageable){
		Page<User> pagingUser = userRepository.findAll(pageable);
		
		List<User> users = pagingUser.getContent();
		return users;
	}
	
	/*
	 * // {id} 주소로 파라미터를 전달 받을 수 있음 // http://localhost:8000/blog/dummy/user/3
	 * 
	 * @GetMapping("/dummy/user/{id}") public User detail(@PathVariable int id) {
	 * 
	 * // user4를 찾으면 내가 데이터베이스에서 못찾아오게 되면 user가 null이됨 // 그럼 return null이 되므로 프로그램에
	 * 문제가 발생 // Optional로 너의 User 객체를 감싸서 가져올테니 null인지 아닌지 판단해서 return해라 User user
	 * = userRepository.findById(id).orElseGet(new Supplier<User>() {
	 * 
	 * @Override public User get() { // TODO Auto-generated method stub return new
	 * User(); }
	 * 
	 * }); return user; }
	 */

	// {id} 주소로 파라미터를 전달 받을 수 있음
	// http://localhost:8000/blog/dummy/user/3
	@GetMapping("/dummy/user/{id}")
	public User detail(@PathVariable int id) {

		// user4를 찾으면 내가 데이터베이스에서 못찾아오게 되면 user가 null이됨
		// 그럼 return null이 되므로 프로그램에 문제가 발생
		// Optional로 너의 User 객체를 감싸서 가져올테니 null인지 아닌지 판단해서 return해라
		// Error 메세지를 출력할 수 있음
		User user = userRepository.findById(id).orElseThrow(new Supplier<IllegalArgumentException>() {
			@Override
			public IllegalArgumentException get() {
				// TODO Auto-generated method stub
				return new IllegalArgumentException("해당 유저는 없습니다. id : " + id);
			}
		});
		// 요청 : 웹브라우저
		// user 객체 = 자바 오브젝트
		// 변환 (웹브라우저가 이해할 수 있는 데이터) -> json (Gson 라이브러리)
		// 스프링부트 = MessageConverter가 응답시에 자동 작동
		// 만약에 자바 오브젝트를 리턴하게 되면 MessageConverter가 Jackson 라이브러리를 호출해서
		// user 오브젝트를 json으로 변환해서 브라우저에게 보냄
		return user;
	}

	/*
	 * // {id} 주소로 파라미터를 전달 받을 수 있음 // http://localhost:8000/blog/dummy/user/3
	 * 
	 * @GetMapping("/dummy/user/{id}") public User detail(@PathVariable int id) {
	 * 
	 * // user4를 찾으면 내가 데이터베이스에서 못찾아오게 되면 user가 null이됨 // 그럼 return null이 되므로 프로그램에
	 * 문제가 발생 // Optional로 너의 User 객체를 감싸서 가져올테니 null인지 아닌지 판단해서 return해라 // Error
	 * 메세지를 출력할 수 있음 // 람다식 User user =
	 * userRepository.findById(id).orElseThrow(()->{ return new
	 * IllegalArgumentException("해당 사용자는 없습니다."); }); return user; }
	 */

	/*
	 * http://localhost:8000/blog/dummy/join (요청) http의 body에 username, password,
	 * email 데이터를 가지고 (요청)
	 * 
	 * @PostMapping("/dummy/join") public String join(String username, String
	 * password, String email) { // key=value (약속된 규칙)
	 * System.out.println("username : " + username);
	 * System.out.println("password : " + password); System.out.println("email : " +
	 * email);
	 * 
	 * return "회원가입이 완료되었습니다."; }
	 */
	// http://localhost:8000/blog/dummy/join (요청)
	// http의 body에 username, password, email 데이터를 가지고 (요청)
	@PostMapping("/dummy/join")
	public String join(User user) { // key=value (약속된 규칙)
		System.out.println("id : " + user.getId());
		System.out.println("username : " + user.getUsername());
		System.out.println("password : " + user.getPassword());
		System.out.println("email : " + user.getEmail());
		System.out.println("role : " + user.getRole());
		System.out.println("createDate : " + user.getCreateDate());

		user.setRole(RoleType.USER);
		userRepository.save(user);
		return "회원가입이 완료되었습니다.";
	}
}
