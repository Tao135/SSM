package com.itheima.config;

import org.springframework.context.annotation.*;



@Configuration      //标志此类是Spring的核心配置类
//<context:property-placeholder location="classpath:jdbc.properties"/>
@ComponentScan("com.itheima")
//<context:component-scan base-package="com.itheima"/>
@Import(DataSourceConfiguration.class)
//<import resource=""/>
public class SpringConfiguration {



}
