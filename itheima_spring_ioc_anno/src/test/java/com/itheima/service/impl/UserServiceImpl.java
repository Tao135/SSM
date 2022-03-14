package com.itheima.service.impl;

import com.itheima.dao.UserDao;
import com.itheima.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.annotation.Resource;

//@Component("userService")
@Service("userService")     //业务层注解
public class UserServiceImpl implements UserService {

    @Value("${jdbc.driver}")        //简单类型注入
    private String driver;

    //<property name="userDao" ref="userDao"/>
    //@Autowired                //按照数据类型从Spring容器中进行匹配
    //@Qualifier("userDao")     //按照id值从容器中进行匹配，但是此处@Qualifier结合@Autowired一起使用
    @Resource(name="userDao")   //@Resource相当于@Qualifier+@Autowired
    private UserDao userDao;
//    public void setUserDao(UserDao userDao){          //set方法，使用注解时可以不写，但用xml进行依赖注入时，需要写
//        this.userDao = userDao;
//    }

    public void save(){
        System.out.println(driver);
        System.out.println("service save...");
    }

    @PostConstruct          //创建bean时初始化方法
    public void init(){
        System.out.println("init...");
    }

    @PreDestroy             //创建bean时销毁方法
    public void destory(){
        System.out.println("destory...");
    }
}
