package com.example.dao;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.example.entity.User;
import com.example.entity.UserInfo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.ResponseBody;

@ResponseBody
public interface UserService {
    User getByName(String username);


    User querybyname(String phone);

    UserInfo queryuserinfo(int uid);

    String findPageObjects(String username, Integer pageCurrent);
    
}
