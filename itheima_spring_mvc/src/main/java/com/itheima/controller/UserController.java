package com.itheima.controller;


import com.fasterxml.jackson.databind.ObjectMapper;
import com.itheima.domain.User;
import com.itheima.domain.Vo;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.xml.ws.spi.http.HttpHandler;
import java.io.IOException;
import java.util.Arrays;
import java.util.Date;
import java.util.List;


@Controller
public class UserController {

    @RequestMapping("/quick20")
    @ResponseBody               //告知SpringMVC不要进行页面跳转，进行字符串回写
    //获取Cookie，value的值要与网页的参数一致
    public void save20(@CookieValue(value = "JSESSIONID") String jseesionId) {
        System.out.println(jseesionId);
    }

    @RequestMapping("/quick19")
    @ResponseBody               //告知SpringMVC不要进行页面跳转，进行字符串回写
    //获取请求头,value要与网页的参数一致
    public void save19(@RequestHeader(value = "User-Agent",required = false)String user_agent) {
        System.out.println(user_agent);
    }

    @RequestMapping("/quick18")
    @ResponseBody               //告知SpringMVC不要进行页面跳转，进行字符串回写
    //API
    public void save18(HttpServletRequest request, HttpServletResponse response, HttpSession session) {
        System.out.println(request);
    }

    @RequestMapping("/quick17")
    @ResponseBody               //告知SpringMVC不要进行页面跳转，进行字符串回写
    public void save17(Date date)  {
        System.out.println(date);
    }

    //localhost:80/quick16/...
    @RequestMapping("/quick16/{name}")
    @ResponseBody               //告知SpringMVC不要进行页面跳转，进行字符串回写
    //GET用于获取资源，POST用于新建资源，PUT用于更新资源，DELETE用于删除资源
    public void save16(@PathVariable(value = "name") String username)  {
        System.out.println(username);
    }

    @RequestMapping("/quick15")
    @ResponseBody               //告知SpringMVC不要进行页面跳转，进行字符串回写
    //@RequestParam注解，value表示将请求参数与形参绑定，进行映射； required默认为true，作用是当没有输入参数时，页面不给通过； defaultValue，作用是当没有输入形参时，默认值为...
    public void save15(@RequestParam(value = "name",required = false,defaultValue = "zxl") String username)  {
        System.out.println(username);
    }

    @RequestMapping("/quick14")
    @ResponseBody               //告知SpringMVC不要进行页面跳转，进行字符串回写
    public void save14(@RequestBody List<User> userList) throws Exception{
        System.out.println("执行");
        System.out.println(userList);
    }

    @RequestMapping("/quick13")
    @ResponseBody               //告知SpringMVC不要进行页面跳转，进行字符串回写
    public void save13(Vo vo)  {
        System.out.println(vo);
    }

    @RequestMapping("/quick12")
    @ResponseBody               //告知SpringMVC不要进行页面跳转，进行字符串回写
    //Controller中的业务方法的数组名称与请求参数的name一致，参数会自动映射
    public void save12(String[] strs)  {
        System.out.println(Arrays.asList(strs));
    }

    @RequestMapping("/quick11")
    @ResponseBody               //告知SpringMVC不要进行页面跳转，进行字符串回写
    //Controller中的业务方法的POJO参数的属性名与请求参数的name一致，参数会自动映射
    public void save11(User user)  {
        System.out.println(user);
    }

    @RequestMapping("/quick10")
    @ResponseBody               //告知SpringMVC不要进行页面跳转，进行字符串回写
    //获得简单参数
    public void save10(String username,int age)  {
        System.out.println(username);
        System.out.println(age);
    }

    @RequestMapping("/quick9")
    @ResponseBody               //告知SpringMVC不要进行页面跳转，进行字符串回写
    //期望SpringMVC自动将User转换为JSON格式的字符串
    public User save9() throws Exception {
        User user = new User();
        user.setUsername("czt and lxz");
        user.setAge(22);
        return user;
    }

    @RequestMapping("/quick8")
    @ResponseBody               //告知SpringMVC不要进行页面跳转，进行字符串回写
    public String save8() throws Exception {
        User user = new User();
        user.setUsername("czt");
        user.setAge(22);
        //使用json转换工具将对象转换成json格式字符串在返回
        ObjectMapper objectMapper = new ObjectMapper();
        String json = objectMapper.writeValueAsString(user);
        return json;
    }

    @RequestMapping("/quick7")
    @ResponseBody               //告知SpringMVC不要进行页面跳转，进行字符串回写
    public String save7() {
        return "{\"username\":\"czt\",\"age\":\":8\"}";
    }

    @RequestMapping("/quick6")
    @ResponseBody               //告知SpringMVC不要进行页面跳转，进行字符串回写
    public String save6() {
        return "玲玲小可爱";
    }

    //回写字符串
    @RequestMapping("/quick5")
    public void save5(HttpServletResponse response) throws IOException {
        response.getWriter().print("张...");
    }

    @RequestMapping("/quick4")
    public String save4(Model model){
        model.addAttribute("username","zxl小可爱");
        return "success";
    }

    @RequestMapping("/quick3")
    public ModelAndView save3(ModelAndView modelAndView ){
        modelAndView.addObject("username","itheima");
        modelAndView.setViewName("success");
        return modelAndView;
    }

    @RequestMapping("/quick2")
    public ModelAndView save2(){
        /*
            model：模型 作用封装数据
            view：视图  作用展示数据
        */
        ModelAndView modelAndView = new ModelAndView();
        //设置模型数据
        modelAndView.addObject("username","itcast");
        //设置视图名称
        modelAndView.setViewName("success");
        return modelAndView;
    }

    @RequestMapping(value = "/quick",method = RequestMethod.GET,params = {"username"})
    public String save(){
        System.out.println("controller save running...");
        return "success";
    }
}
