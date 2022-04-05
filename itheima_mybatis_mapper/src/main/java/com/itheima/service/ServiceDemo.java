package com.itheima.service;

import com.itheima.mapper.UserMapper;
import com.itheima.domain.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

public class ServiceDemo {

    public static void main(String[] args) throws Exception {
        InputStream resourceAsStream = Resources.getResourceAsStream("sqlMapConfig.xml");
        SqlSessionFactory sqlsessionFactory = new SqlSessionFactoryBuilder().build(resourceAsStream);
        SqlSession sqlSession = sqlsessionFactory.openSession();

        UserMapper mapper = sqlSession.getMapper(UserMapper.class);

        //模拟ids的数据
        List<Integer> ids = new ArrayList<Integer>();
        ids.add(1);

        List<User> userList = mapper.findByIds(ids);
        System.out.println(userList);

    }
}
