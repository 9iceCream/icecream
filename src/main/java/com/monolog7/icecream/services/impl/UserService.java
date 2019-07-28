package com.monolog7.icecream.services.impl;

import com.monolog7.icecream.dao.IRolePermissionDao;
import com.monolog7.icecream.dao.IUserDao;
import com.monolog7.icecream.entity.RolePermission;
import com.monolog7.icecream.entity.User;
import com.monolog7.icecream.services.IUserService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class UserService implements IUserService {

    @Autowired
    IUserDao iUserDao;

    @Autowired
    IRolePermissionDao iRolePermissionDao;

    @Override
    public void userLogin(User user) {

    }

    @Override
    public void userLogout(User user) {

    }

    @Override
    public boolean userRegister(User user) {
        int addResult = iUserDao.addUser(user);
        boolean response = addResult == 0 ? false : true;
        return response;
    }

    @Override
    public void userUnRegister(User user) {

    }

    @Override
    public void modifyUserInfo(String oldUsername, User user) {

    }

    @Override
    public boolean setUserRole(User user, RolePermission rolePermission) {
        boolean response = false;
        User userData = iUserDao.getUserByName(user.getUsername());
        RolePermission rolePermissionData = iRolePermissionDao.getRole(rolePermission.getRole());
        if(rolePermissionData == null || userData == null){
            return response;
        }else{
            user.setRole(rolePermission.getRole());
            int result = iUserDao.updateUserByName(user.getUsername(),user);
            response = result == 0 ? false : true;
        }
        return response;
    }

    @Override
    public void modifyUserRole(User user, RolePermission rolePermission) {
    }
}
