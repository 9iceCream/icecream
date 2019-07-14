package com.monolog7.icecream.controller;

import com.monolog7.icecream.entity.User;
import io.swagger.annotations.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;


@Api(description = "用户信息的增删改查")
@Controller
@RequestMapping("/user")
public class UserCrudController {

    @ApiOperation(value = "添加用户")
    @ApiImplicitParams({@ApiImplicitParam(name="name",value = "用户名",required = true,dataType = "String")
            ,@ApiImplicitParam(name="password",value = "用户密码",required = true,dataType = "String")
            ,@ApiImplicitParam(name = "email",value = "用户邮箱",required = true,dataType = "String")})
    @RequestMapping(value = "/add",method = RequestMethod.POST)
    @ResponseBody
    public String addNewUser(@RequestParam String name,@RequestParam String password,@RequestParam String email){
        User user = new User();
        return "Saves";
    }

    @ApiOperation("查询所有用户")
    @ApiResponses({@ApiResponse(code = 200,message = "用户信息",response = Iterable.class)})
    @RequestMapping(value = "/all",method = RequestMethod.GET)
    @ResponseBody
    public Iterable<User> findAllUser(){
        return null;
    }
}
