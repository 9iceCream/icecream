package com.monolog7.icecream.dao;

import com.monolog7.icecream.entity.RolePermission;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface RolePermissionDao {
    int addRole(RolePermission rolePermission);
    RolePermission getRole(int role);
    int updateRole(int oldRole,RolePermission rolePermission);
    int deleteRole(int role);
}
