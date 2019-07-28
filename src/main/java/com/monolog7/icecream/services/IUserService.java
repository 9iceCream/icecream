package com.monolog7.icecream.services;

import com.monolog7.icecream.entity.RolePermission;
import com.monolog7.icecream.entity.User;

/**
 * 用户相关服务
 */
public interface IUserService {

    /**
     * 用户登录
     * @param user 用户信息
     */
    void userLogin(User user);

    /**
     * 用户登出
     * @param user 用户信息
     */
    void userLogout(User user);

    /**
     * 用户注册
     * @param user 用户信息
     */
    boolean userRegister(User user);

    /**
     * 用户注销
     * @param user 用户信息
     */
    void userUnRegister(User user);

    /**
     * 修改用户信息
     * @param oldUsername 原用户名
     * @param user 用户信息
     */
    void modifyUserInfo(String oldUsername,User user);

    /**
     * 设置用户角色
     * @param user 用户信息
     * @param rolePermission 用户角色
     */
    boolean setUserRole(User user, RolePermission rolePermission);

    /**
     * 修改用户权限
     * @param user 用户信息
     * @param rolePermission 用户角色
     */
    void modifyUserRole(User user,RolePermission rolePermission);
}
