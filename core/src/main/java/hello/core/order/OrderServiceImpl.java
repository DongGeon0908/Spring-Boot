package hello.core.order;

import hello.core.discount.DiscountPolicy;
import hello.core.member.Member;
import hello.core.member.MemberRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor // final로 선언된 객체를 생성자로 만들어줌!! 굳굳
public class OrderServiceImpl implements OrderService {

    // 생성자 주입!! <- 생성자에서만 값을 넣어줄 수 있음!!
    // 1. 개발자의 실수를 줄일 수 있다
    // 2. 여기서 정해진 데이터만 만들어지니까 오류를 줄일 수 있다 
    // 결론은 불변과 누락, 그리고 final keyword를 통한 캡슐화와 오류를 줄일 수 있다
    // 컴파일 오류가 가장 좋은 오류!!
    private MemberRepository memberRepository;
    private DiscountPolicy discountPolicy;


    // 셍성자가 하나일때는 @Autowired를 생략할 수 있음
    //public OrderServiceImpl(MemberRepository memberRepository, DiscountPolicy discountPolicy) {
    //    this.memberRepository = memberRepository;
    //    this.discountPolicy = discountPolicy;
    //}

    @Autowired
    public void init(MemberRepository memberRepository, DiscountPolicy discountPolicy) {
        this.memberRepository = memberRepository;
        this.discountPolicy = discountPolicy;
    }


    @Override
    public Order createOrder(Long memberId, String itemName, int itemPrice) {
        Member member = memberRepository.findById(memberId);
        int discountPrice = discountPolicy.discount(member, itemPrice);

        return new Order(memberId, itemName, itemPrice, discountPrice);
    }

    // 테스트 용도
    public MemberRepository getMemberRepository() {
        return memberRepository;
    }
}
