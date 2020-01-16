package com.example.mapper;

import com.baomidou.mybatisplus.mapper.BaseMapper;

import com.example.entity.Role;
import com.example.entity.SysRole;


import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SysRoleMapper extends  BaseMapper<Role>{

    List<SysRole> findPageObjects(@Param("c") String c, @Param("startIndex") int startIndex, @Param("pageSize") int pageSize);

    int getRowCount(@Param("c") String c);
}
