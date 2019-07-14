package com.monolog7.icecream.entity;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.Date;

@Setter
@Getter
@ToString
@EqualsAndHashCode
public class User {
    private long id;
    private String username;
    private String password;
    private String email;
    private int phone;
    private String intro;
    private int qq;
    private String wechat;
    private String address;
    private String hobby;
    private int role;
    private Date createTime;
    private Date updateTime;
    private Date birthday;
}
