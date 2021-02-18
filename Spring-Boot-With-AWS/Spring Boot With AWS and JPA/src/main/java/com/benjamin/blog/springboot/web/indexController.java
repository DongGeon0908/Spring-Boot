package com.benjamin.blog.springboot.web;


import com.benjamin.blog.springboot.config.auth.LoginUser;
import com.benjamin.blog.springboot.config.auth.dto.SessionUser;
import com.benjamin.blog.springboot.service.posts.PostsService;
import com.benjamin.blog.springboot.web.dto.PostsResponseDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;


@RequiredArgsConstructor
@Controller
public class indexController {

    private final PostsService postsService;

    @GetMapping("/")
    public String index(Model model, @LoginUser SessionUser user){
        model.addAttribute("posts", postsService.findAllDesc());
        if(user != null){
            model.addAttribute("usersName", user.getName()); //userName은 컴퓨터 사용자 이름 예약어!! 다른 이름으로 변경!
        }
        return "index";
    }

    // @LoginUser SessionUser user를 통해 어디에서도 세션 정보를 가져올 수 있음

    
    @GetMapping("/posts/save")
    public String postsSave(){
        return "posts-save";
    }

    @GetMapping("/posts/update/{id}")
    public String postsUpdate(@PathVariable Long id, Model model) {
        PostsResponseDto dto = postsService.findById(id);
        model.addAttribute("post", dto);

        return "posts-update";
    }
}
