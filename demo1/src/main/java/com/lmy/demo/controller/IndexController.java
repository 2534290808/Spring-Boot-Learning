package com.lmy.demo.controller;

import com.lmy.demo.entity.User;
import com.sun.org.glassfish.gmbal.ParameterNames;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.HashMap;
@RestController
@RequestMapping(value = "/index")
public class IndexController {
    private static final Logger logger=LoggerFactory.getLogger(IndexController.class);
    @RequestMapping
    public String index(){
        //throw new RuntimeException();
        //logger.debug("this is a test DEBUG");
        logger.info("this is a test INFO");
        return "Hello World";
    }

    @RequestMapping(value="/get")
    public HashMap<String,Object> get(@RequestParam String name){
        HashMap<String,Object> map=new HashMap<>();
        map.put("title","Hello World");
        map.put("name",name);
        return map;
    }
    //@PathVariable从url获取参数
    @RequestMapping(value="/get/{id}/{name}")
    public User get(@PathVariable int id,@PathVariable String name){
        User user=new User();
        user.setId(id);
        user.setName(name);
        user.setDate(new Date());
        return user;
    }
}
