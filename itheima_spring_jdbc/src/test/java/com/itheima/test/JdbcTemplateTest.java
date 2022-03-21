package com.itheima.test;

import com.mchange.v2.c3p0.ComboPooledDataSource;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

public class JdbcTemplateTest {

    @Test
    //测试Spring产生JdbcTemplate对象
    public void test2() throws  Exception{
        ApplicationContext app = new ClassPathXmlApplicationContext("applicationContext.xml");
        JdbcTemplate jdbc = app.getBean(JdbcTemplate.class);
        int row = jdbc.update("insert into account value (?,?)", "csy", 8000);
        System.out.println(row);
    }

    @Test
    //测试JdbcTemplate开发步骤
    public void test1() throws  Exception{
        ComboPooledDataSource dataSource = new ComboPooledDataSource();
        dataSource.setDriverClass("com.mysql.jdbc.Driver");
        dataSource.setJdbcUrl("jdbc:mysql://localhost:3306/test?serverTimezone=UTC&useSSL=false");
        dataSource.setUser("root");
        dataSource.setPassword("123456");

        JdbcTemplate jdbc = new JdbcTemplate();
        //设置数据源对象，知道数据库在哪
        jdbc.setDataSource(dataSource);
        //执行操作，利用占位符表示填入数据将映射在哪
        int row = jdbc.update("insert into account value (?,?)", "tao", 10000);
        System.out.println(row);

    }
}
