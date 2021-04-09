package hello.hellospring.controller;

import hello.hellospring.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class MemberController {

    private final MemberService memberService;

    // 객체를 생성해서 스프링이 갖고있음
    @Autowired
    public MemberController(MemberService memberService){
        this.memberService = memberService;
    }

}
