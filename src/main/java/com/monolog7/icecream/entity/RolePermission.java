package com.monolog7.icecream.entity;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
@EqualsAndHashCode
public class RolePermission {
    private int id;
    private int role;
    private String roleName;
    //权限
    private String permission;
}
