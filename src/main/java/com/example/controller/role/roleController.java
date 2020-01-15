package com.example.controller.role;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
@RequestMapping("/")
public class roleController {
    @RequestMapping("doRoleListUI")
    public String roleList(){

        return "sys/role";
    }
}
