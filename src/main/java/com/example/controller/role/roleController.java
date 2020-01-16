package com.example.controller.role;

import com.example.entity.JsonResult;
import com.example.service.SysRoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/")
public class roleController {

    @Autowired
    SysRoleService sysrole;
    @RequestMapping("doRoleListUI")
    public String roleList(){

        return "sys/role";
    }


    @RequestMapping("/doroleFindPageObjects")
    @ResponseBody
    public JsonResult doroleFindPageObjects(String name,Integer pageCurrent) {
        System.out.println(pageCurrent);
        return new JsonResult(sysrole.findPageObjects(name, pageCurrent));
    }
}
