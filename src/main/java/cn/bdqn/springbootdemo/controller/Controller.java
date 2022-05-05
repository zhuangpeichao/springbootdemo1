package cn.bdqn.springbootdemo.controller;

import cn.bdqn.springbootdemo.bean.User;
import cn.bdqn.springbootdemo.service.impl.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
    @GetMapping(value = "/Hello")
   public String Hello(){
       return "Hello";
   }



    @Autowired
    public UserServiceImpl userService;
    @GetMapping(value = "/login")
    public String login(String userName){


     User user= userService.querByName(userName);
        System.out.println(user);
     if (user!=null){

         return "success";
     }
        return "failure";

    }

}


