package com.lmy.demo.controller;

import com.lmy.demo.entity.User;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.HashMap;

@RestController
@RequestMapping(value = "/config")
public class ConfigLmyController {
    //获取application.properties中的roncoo.secret
    @Value(value = "${roncoo.secret}")
    private String secret;
    @Value(value = "${roncoo.number}")
    private int id;
    @Value(value = "${roncoo.desc}")
    private String desc;

    @RequestMapping
    public String config(){
        return "Config Class";
    }

    // @RequestParam 简单类型的绑定，可以出来get和post
    @RequestMapping(value = "/get")
    public HashMap<String, Object> get(@RequestParam String name) {
        HashMap<String, Object> map = new HashMap<String, Object>();
        map.put("title", "hello world");
        map.put("name", name);
        map.put("secret", secret);
        map.put("id", id);
        map.put("desc", desc);
        return map;
    }
}
