package com.example.entity;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Setter
@Getter
public class User implements Serializable {
    private Integer uid;
    private String upwd;//密码
    private String phone;
    private List<Role> roles;

}
