package com.itheima.service.impl;

import com.itheima.dao.UserDao;
import com.itheima.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("userService")
public class UserServiceImpl implements UserService {

    //<property name="userDao" ref="userDao"/>
    @Autowired
    @Qualifier("userDao")
    private UserDao userDao;
    public void setUserDao(UserDao userDao){
        this.userDao = userDao;
    }

    public void save(){
        System.out.println("service save...");
    }
}
