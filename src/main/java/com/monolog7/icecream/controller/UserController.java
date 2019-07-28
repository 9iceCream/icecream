package com.monolog7.icecream.controller;

import com.monolog7.icecream.entity.RolePermission;
import com.monolog7.icecream.entity.User;
import com.monolog7.icecream.services.IUserService;
import io.swagger.annotations.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@Api(description = "用户的相关操作")
@RestController
@RequestMapping(value = "/user/")
public class UserController {

    @Autowired
    IUserService iUserService;

    @ApiOperation(value = "用户注册")
    @ApiImplicitParams({@ApiImplicitParam(name="user",value = "用户信息",required = true,dataType = "User")})
    @RequestMapping(value = "register",method = RequestMethod.POST)
    public String userRegister(@RequestParam User user){
        iUserService.userRegister(user);
        RolePermission role = new RolePermission();
        iUserService.setUserRole(user,role);
        return "Saves";
    }

    @ApiOperation(value = "用户登录")
    @ApiImplicitParams({@ApiImplicitParam(name = "user",value = "用户信息",required = true,dataType = "User")})
    @RequestMapping(value = "login",method = RequestMethod.POST)
    public String userLogin(@RequestParam User user){
        iUserService.userLogin(user);
        return "用户登录";
    }

    @ApiOperation(value = "用户登出")
    @ApiImplicitParams({@ApiImplicitParam(name = "user",value = "用户信息",required = true,dataType = "User")})
    @RequestMapping(value = "logout",method = RequestMethod.POST)
    public String userLogout(@RequestParam User user){
        iUserService.userLogout(user);
        return "用户登出";
    }

    @ApiOperation(value = "用户注销")
    @ApiImplicitParams({@ApiImplicitParam(name = "user",value = "用户信息",required = true,dataType = "User")})
    @RequestMapping(value = "unregister",method = RequestMethod.POST)
    public String userUnregister(@RequestParam User user){
        iUserService.userUnRegister(user);
        return "用户注销";
    }
}
