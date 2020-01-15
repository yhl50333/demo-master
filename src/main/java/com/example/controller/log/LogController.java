package com.example.controller.log;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping("/log")
public class LogController {

    @RequestMapping("/doLogListUI")
    public String Loglist(){
        System.out.println("return \"sys/loglist");
        return "sys/log_list";
    }

}
