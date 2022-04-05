package com.itheima.mapper.impl;

import com.itheima.mapper.UserDao;

import java.util.List;

public class UserDaoImpl implements UserDao {

    private String username;
    private int age;
    private List<String> strList;

    public void setStrList(List<String> strList) {
        this.strList = strList;
    }
    public void setUsername(String username) {
        this.username = username;
    }
    public void setAge(int age) {
        this.age = age;
    }

    public UserDaoImpl(){
        System.out.println("UserDaoImpl创建");
    }

    public void init(){
        System.out.println("初始化...");
    }

   public void end(){
       System.out.println("销毁...");
   }

    public void save(){
        System.out.println(username + "====" + age);
        System.out.println(strList);
        System.out.println("save running...");
    }

}
