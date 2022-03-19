package com.itheima.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@Controller
public class UserController {

    @RequestMapping("/")
    public String index(){
        return "index.jsp";
    }

    @RequestMapping(value = "/quick",method = RequestMethod.GET,params = {"username"})
    public String save(){
        System.out.println("controller save running...");
        return "success";
    }
}
