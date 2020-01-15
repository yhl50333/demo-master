package com.example.controller.dept;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
@RequestMapping("/")
public class deptController {

    @RequestMapping("doDeptListUI")
    public String DeptList(){
        return "sys/dept";
    }
}
