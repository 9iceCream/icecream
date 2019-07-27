package com.monolog7.icecream.controller;

import com.monolog7.icecream.dao.UserDao;
import com.monolog7.icecream.entity.User;
import io.swagger.annotations.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;


@Api(description = "用户信息的增删改查")
@RestController
public class UserCrudController {

    @Autowired
    private UserDao userDao;

    @ApiOperation(value = "添加用户")
    @ApiImplicitParams({@ApiImplicitParam(name="name",value = "用户名",required = true,dataType = "String")
            ,@ApiImplicitParam(name="password",value = "用户密码",required = true,dataType = "String")
            ,@ApiImplicitParam(name = "email",value = "用户邮箱",required = true,dataType = "String")})
    @RequestMapping(value = "/user",method = RequestMethod.POST)
    public String addNewUser(@RequestParam String name,@RequestParam String password,@RequestParam String email){
        User user = new User();
        user.setUsername(name);
        user.setPassword(password);
        user.setEmail(email);
        userDao.addUser(user);
        return "Saves";
    }

    @ApiOperation("查询用户")
    @ApiResponses({@ApiResponse(code = 200,message = "用户信息",response = Iterable.class)})
    @RequestMapping(value = "/user",method = RequestMethod.GET)
    public User findUser(@RequestParam String username){
        return userDao.getUserByName(username);
    }

    @ApiOperation("删除用户")
    @ApiImplicitParams({@ApiImplicitParam(name="username",value = "用户名",required = true,dataType = "String")})
    @RequestMapping(value = "/user",method = RequestMethod.DELETE)
    public String deleteUser(String username){
        int result = userDao.deleteUserByName(username);
        if(result==0){
            return "failure";
        }
        return "success";
    }

    @ApiOperation("更新用户")
    @ApiImplicitParams({@ApiImplicitParam(name = "oldusername",value = "用户名",required = true,dataType = "String"),@ApiImplicitParam(name = "user",value = "用户信息",required = true,dataType = "User")})
    @RequestMapping(value = "/user",method = RequestMethod.PUT)
    public String updateUser(String oldusername,User user){
        int result = userDao.updateUserByName(oldusername,user);
        if(result==0){
            return "failure";
        }
        return "seccess";
    }
}
