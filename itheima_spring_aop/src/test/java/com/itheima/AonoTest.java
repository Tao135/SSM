package com.itheima;

import com.itheima.anno.TargetInterface;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext-anno.xml")
@EnableAspectJAutoProxy
public class AonoTest {

    @Autowired
    private TargetInterface target;

    @Test
    public void test1(){
        target.save();
    }


}
