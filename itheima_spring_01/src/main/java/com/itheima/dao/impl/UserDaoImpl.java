package com.itheima.dao.impl;

import com.itheima.dao.UserDao;

public class UserDaoImpl implements UserDao {

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
        System.out.println("save running...");
    }

}
