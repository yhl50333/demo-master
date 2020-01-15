package com.example.controller.pwdEdit;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class PwdEdit {
    @RequestMapping("doPwdEditUI")
    public String doPwdEditUI(){
        return "sys/Pwd";
    }
}
