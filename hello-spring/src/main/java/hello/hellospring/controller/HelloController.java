package hello.hellospring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloController {

    @GetMapping("hello")
    public String hello(Model model){

        // data에 hello!!를 넣음 -> return할때 resources -> templates 안에 있는 파일을 찾음
        model.addAttribute("data", "hello!!");
        return "hello";
    }
}
