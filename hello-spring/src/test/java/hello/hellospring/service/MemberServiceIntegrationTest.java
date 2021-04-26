package hello.hellospring.service;

import hello.hellospring.domain.Member;
import hello.hellospring.repository.MemberRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertThrows;

// 테스트는 통합 테스트보다 단위 테스트가 중요함!!

@SpringBootTest // 스프링 컨테이너와 테스트를 함께 실행
@Transactional // 테스트를 반복해서 실행 가능하다 -> rollback  기능 (각각의 테스트 모두 rollback 실행) --> DB에 데이터가 남지 않기 때문에 효율적
class MemberServiceIntegrationTest {

    @Autowired
    MemberService memberService;

    @Autowired
    MemberRepository memberRepository;


    @Test
    void 회원가입() {
        // given
        Member member = new Member();
        member.setName("hello");

        // when
        Long saveId = memberService.join(member);

        // then
        Member findMember = memberService.findOne(saveId).get();
        assertThat(member.getName()).isEqualTo(findMember.getName());
    }

    @Test
    public void 중복회원예외(){
        // given
        Member member1 = new Member();
        member1.setName("스프링");

        Member member2 = new Member();
        member2.setName("스프링");

        // when
        memberService.join(member1);


        assertThrows(IllegalStateException.class, () -> memberService.join(member2));



    }


    @Test
    void findMembers() {
    }

    @Test
    void findOne() {
    }
}