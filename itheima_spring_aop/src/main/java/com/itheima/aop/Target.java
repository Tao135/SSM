package com.itheima.aop;

import com.itheima.proxy.jdk.TargetInterface;

public class Target implements TargetInterface {


    public void save() {
        System.out.println("save running");
//        int i =   1/0;
    }
}
