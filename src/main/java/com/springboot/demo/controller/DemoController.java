package com.springboot.demo.controller;


import com.springboot.demo.bean.User;
import com.springboot.demo.service.DemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class DemoController {

    @Autowired
    private DemoService demoService;


    @GetMapping("/demo")

     @ResponseBody String demo(@RequestParam(value="page") int page){

        return "page加一结果："+demoService.add(page);
//        return "接收到页面参数："+page;
    }


    @GetMapping("/hello")
    @ResponseBody String hello(){
        return "hello word! ";
    }

    @GetMapping("/user")
    @ResponseBody String user(@RequestParam("userName")String userName,@RequestParam("age")int age){
        User user=new User();
        user.setAge(age);
        user.setUserName(userName);
        System.out.println(user);
        return "输入的对象信息："+ user.toString();
    }
 }
