package hello.springmvc.basic.requestmapping;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/mapping/users")
public class MappingClassController {

    @GetMapping
    public String user() {
        return "get users";
    }

    @PostMapping
    public String addUser() {
        return "post user";
    }

    @GetMapping("/{userId}")
    public String findUser(@PathVariable String userID) {
        return "get userId = " + userID;
    }

    @PatchMapping("/{userId}")
    public String updateUser(@PathVariable String userID) {
        return "update userId = " + userID;
    }

    @DeleteMapping("/{userId}")
    public String deleteUser(@PathVariable String userID) {
        return "update userId = " + userID;
    }
}
