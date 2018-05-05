package com.lmy.demo.controller;

import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class MyErrorController implements ErrorController {
    //Spring Boot 将所有的错误默认映射到/error
    @RequestMapping("/error")
    public ModelAndView error( ){
        //网页中使用http://localhost:8080/404.html中可以访问得到
        return new ModelAndView("404");
    }

    @Override
    public String getErrorPath() {
        return "/error";
    }
}
