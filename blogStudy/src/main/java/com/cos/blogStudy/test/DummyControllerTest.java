package com.cos.blogStudy.test;

import java.util.List;
import java.util.function.Supplier;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.web.PageableDefault;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cos.blogStudy.model.RoleType;
import com.cos.blogStudy.model.User;
import com.cos.blogStudy.repository.UserRepository;

// html 파일이 아닌, data를 리턴해주는 것이 Restcontroller!!!
@RestController
public class DummyControllerTest {

	@Autowired // 의존성 주입
	private UserRepository userRepository;

	@DeleteMapping("/dummy/user/{id}")
	public String delete(@PathVariable int id) {
		try {
			userRepository.deleteById(id);
		} catch (EmptyResultDataAccessException e) {
			return "삭제에 실패했습니다. 해당 ID는 DB에 없습니다";
		}

		return "삭제 되었습니다. id : " + id;
	}

	// email, password 수정
	@Transactional // 함수 종료시에 자동으로 commit 진행
	@PutMapping("/dummy/user/{id}")
	public User updateUser(@PathVariable int id, @RequestBody User requestUser) { // json 데이터 요청 ==> JAVA Object로 변환해서
																					// 받아옴 (<==스프링부트가 해줌)
		System.out.println("id : " + id);
		System.out.println("password : " + requestUser.getPassword());
		System.out.println("email : " + requestUser.getEmail());

		User user = userRepository.findById(id).orElseThrow(() -> {
			return new IllegalArgumentException("수정 실패");
		});

		user.setPassword(requestUser.getPassword());
		//user.setEmail(requestUser.getEmail());

		// save()는 id를 전달하지 않으면 insert
		// save()는 id를 전달하고, id에 대한 데이터가 있으면 update
		// save()는 id는 전달하고, id에 대한 데이터가 없다면 insert
		// userRepository.save(user);
		return user;
	}

	/*
	 * 더티체킹 데이터의 변화를 발견하면 DB의 내용을 수정
	 */

	// http://localhost:8000/blog/dummy/user
	@GetMapping("/dummy/users")
	public List<User> list() {
		return userRepository.findAll();
	}

	// 한 페이지당 2건에 데이터를 리턴받아 볼 예정
	@GetMapping("/dummy/user")
	public List<User> pageList(
			@PageableDefault(size = 1, sort = "id", direction = Sort.Direction.DESC) Pageable pageable) {
		Page<User> pagingUser = userRepository.findAll(pageable);

		List<User> users = pagingUser.getContent();

		return users;
	}

	// {id} 주소로 파라미터를 전달 받음
	// http://localhost:8000/blog/dummy/user/3
	@GetMapping("/dummy/user/{id}")
	public User detail(@PathVariable int id) {
		/*
		 * user/4를 찾으면 내가 데이터베이스에서 못찾아오게 되면 user가 null이됨 그러면 return null이 리턴됨 -> 프로그램 문제
		 * 발생 결론적으로 Optional로 User 객체를 감싸서 가져와서 null인지 파단하고 return
		 */

		User user = userRepository.findById(id).orElseThrow(new Supplier<IllegalArgumentException>() {

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
		// 만약에 자바 오브젝트를 리턴하게 되면 Messageconverter가 Jackson라이브러리를 호출해서 User 오브젝트를 Json으로
		// 변환해서 웹으로 보냄
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
		userRepository.save(user);
		return "회원가입 완료";
	}
}
