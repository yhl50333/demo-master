package com.example.service;

import com.example.entity.PageObject;
import com.example.entity.Role;
import com.example.entity.SysRole;
import org.springframework.stereotype.Repository;


public interface SysRoleService {

    PageObject<SysRole> findPageObjects(String c, Integer pageCurrent);
}
