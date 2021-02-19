package com.zerock.ex1.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController // 별도의 화면 없이 데이터를 전송 가능
public class SampleController {

    @GetMapping("/hello") // 브라우저의 주소창에서 호출이 가능하도록 설정, 해당 데이터는 JSON형태로 전송됨
    public String[] hello() {
        return new String[]{"Hello", "World"};
    }
}
