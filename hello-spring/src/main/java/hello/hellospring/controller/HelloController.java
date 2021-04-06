package hello.hellospring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {

    @GetMapping("hello")
    public String hello(Model model) {

        // data에 hello!!를 넣음 -> return할때 resources -> templates 안에 있는 파일을 찾음
        model.addAttribute("data", "hello!!");
        return "hello";
    }

    // static - > page를 리턴
    // GetMapping 안에 주소는 request 요청임!
    @GetMapping("hello-mvc")
    public String helloMvc(@RequestParam(value = "name", required = true) String name, Model model){
        model.addAttribute("name", name);
        return "hello-template";
    }

    // MVC -> 데이터 및 템플릿을 MVC로 나눠서 사용
    @GetMapping("hello-string")
    @ResponseBody // http 전송 방식의 body 부분에 데이터를 직접 추가
    public String helloString(@RequestParam("name") String name){
        return "hello " + name; // hello + 사용자입력
    }

    // API -> json 방식이 default
    @GetMapping("hello-api")
    @ResponseBody
    public Hello helloApi(@RequestParam("name") String name){
        Hello hello = new Hello();
        hello.setName(name);
        return hello;
    }


    // Getter / Setter 는 자바 Bean 기본 방식!!
    static class Hello {
        private String name;

        public String getName(){
            return name;
        }

        public void setName(String name){
            this.name = name;
        }
    }

}
