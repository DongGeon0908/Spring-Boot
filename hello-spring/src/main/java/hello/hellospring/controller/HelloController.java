package hello.hellospring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HelloController {

    @GetMapping("hello")
    public String hello(Model model) {

        // data에 hello!!를 넣음 -> return할때 resources -> templates 안에 있는 파일을 찾음
        model.addAttribute("data", "hello!!");
        return "hello";
    }

    // GetMapping 안에 주소는 request 요청임!
    @GetMapping("hello-mvc")
    public String helloMvc(@RequestParam(value = "name", required = true) String name, Model model){
        model.addAttribute("name", name);
        return "hello-template";
    }
}
