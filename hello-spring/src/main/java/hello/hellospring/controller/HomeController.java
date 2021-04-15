package hello.hellospring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    // 요청에 대해 컨트롤러에서 먼저 확인하고 -> 없으면 static 파일 찾음
    @GetMapping("/")
    public String home(){
        return "home";
    }

}
