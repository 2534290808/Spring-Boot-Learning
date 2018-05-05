package com.lmy.demo.controller;

import com.lmy.demo.pojo.User;
import com.lmy.demo.service.impl.UserServiceImpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping(value = "/user")
public class UserController {
    private static final Logger logger=LoggerFactory.getLogger(UserController.class);

    @Autowired
    private UserServiceImpl impl;

    @RequestMapping
    public String index(){
        return "user controller";
    }
    @RequestMapping(value = "/getUser")
    public User getUser(@RequestParam(required = false) String name,@RequestParam(required = false) String pwd){
        logger.info("impl"+impl);
        User user=new User();
        user.setName(name);
        user.setPassword(pwd);
        return impl.getUser(user);
    }
}
