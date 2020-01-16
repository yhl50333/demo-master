package com.example.service.Impl;

import com.example.entity.PageObject;
import com.example.entity.PageUtil;
import com.example.entity.Role;
import com.example.entity.SysRole;
import com.example.mapper.SysRoleMapper;
import com.example.service.SysRoleService;
import org.hibernate.service.spi.ServiceException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SysRoleServicImpl implements SysRoleService {
    @Autowired
    SysRoleMapper sysrole;


    @Override
    public PageObject<SysRole> findPageObjects(String name, Integer pageCurrent) {
        //1.判定pageCurrent参数合法性
        if(name==null){
            name="";
        }
        StringBuffer b = new StringBuffer();
        b.append("%");
        b.append(name);
        b.append("%");

        String c= String.valueOf(b);
        System.out.println(c);
        if (pageCurrent == null || pageCurrent < 1)
            throw new IllegalArgumentException("当前页码值不正确");
        //2.查询日志总记录数,并进行判定
        int rowCount = sysrole.getRowCount(c);
        if (rowCount == 0)
            throw new ServiceException("没有找到对应记录");
        //3.查询当前页日志记录
        int pageSize = 3;
        int startIndex = (pageCurrent - 1) * pageSize;
        List<SysRole> records = sysrole.findPageObjects(c, startIndex, pageSize);
        //4.对查询结果进行封装并返回
        PageObject<SysRole> po =
                PageUtil.newInstance(pageCurrent, rowCount, pageSize, records);
        return po;
    }
}