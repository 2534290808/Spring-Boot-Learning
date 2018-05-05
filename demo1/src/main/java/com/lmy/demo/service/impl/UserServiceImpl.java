package com.lmy.demo.service.impl;

import com.lmy.demo.pojo.User;
import com.lmy.demo.mapper.UserMapper;
import com.lmy.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper mapper;


    @Override
    public User getUser(User user) {
        return mapper.getUser(user);
    }
}
