package com.example.controller.user;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class userController {
    @RequestMapping("doUserListUI")
    public String userList(){
        return "sys/userlist";
    }
}
