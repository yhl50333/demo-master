package com.example.controller.menu;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class MenuController {
    @RequestMapping("doMenuListUI")
    public String doMenuListUI(){
        return "sys/menu";
    }

}
