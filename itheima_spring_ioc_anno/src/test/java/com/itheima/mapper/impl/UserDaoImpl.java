package com.itheima.mapper.impl;

import com.itheima.mapper.UserDao;
import org.springframework.stereotype.Repository;

//<bean id="userDao" class="com.itheima.dao.impl.UserDaoImpl">
//@Component("userDao") 两个注解
@Repository("userDao")   //仓库
public class UserDaoImpl implements UserDao {
    public void save(){
        System.out.println("Dao save...");
    }
}
