package com.monolog7.icecream.service;

import com.monolog7.icecream.entity.RolePermission;
import com.monolog7.icecream.entity.User;
import com.monolog7.icecream.services.IUserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Date;

@Component
public class UserServiceTest {

    private Logger logger = LoggerFactory.getLogger(getClass());

    @Autowired
    private IUserService iUserService;

    public void register(){
        User user = new User();
        user.setUsername("诗酒趁年华");
        user.setPassword("cheng@73");
        user.setEmail("monolog7@163.com");
        user.setCreateTime(new Date());
        user.setState(1);
        boolean result = iUserService.userRegister(user);
        logger.info("用户相关操作#register#result:{}",result);
    }

    public void setUserRole(){
        User user = new User();
        user.setUsername("诗酒趁年华");
        user.setPassword("cheng@73");
        RolePermission rolePermission = new RolePermission();
        rolePermission.setRole(1);
        boolean result = iUserService.setUserRole(user,rolePermission);
        logger.info("用户相关操作#setUserRole#result:{}",result);
    }
}
