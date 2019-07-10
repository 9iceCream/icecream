package com.monolog7.icecream.controller;

import com.monolog7.icecream.entity.User;
import com.monolog7.icecream.entity.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
@RequestMapping("/user")
public class UserCrudController {
    @Autowired
    private UserRepository userRepository;

    @RequestMapping("/add")
    @ResponseBody
    public String addNewUser(@RequestParam String name,@RequestParam String password,@RequestParam String email){
        User user = new User();
        user.setUsername(name);
        user.setPassowrd(password);
        user.setEmail(email);
        userRepository.save(user);
        return "Saves";
    }

    @RequestMapping("/all")
    @ResponseBody
    public Iterable<User> findAllUser(){
        return userRepository.findAll();
    }
}
