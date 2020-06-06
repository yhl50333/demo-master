package com.example.controller.log;

import com.example.dao.UserService;
import com.example.entity.JsonResult;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
@RequestMapping("/")
public class LogController {
    @Autowired
    UserService sysUserService;

    @RequestMapping("doLogListUI")
    public String Loglist(@Param("url")String url){

        return  "sys/list";
    }



}
