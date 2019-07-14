package com.monolog7.icecream.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@Api(value = "HelloController")
@RestController
public class HelloController {
    @ApiOperation(value = "hello")
    @RequestMapping(value = "/hello",method = RequestMethod.GET)
    public String hello(){
        return "你好，明天！";
    }
}
