package com.erin.security.controller;

import com.erin.security.utils.RedisUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @Autowired
    private RedisUtils redisUtils;


    @GetMapping
    public String sayHello(){
        return "hello secury";
    }

    @GetMapping("admin")
    @PreAuthorize("hasAnyRole('admin')")
    public String sayHelloToAdmin(){
        return "hello admin";
    }

    @GetMapping("user2")
    @PreAuthorize("hasAnyRole('user')")
    public String sayHelloToUser(){
        return "hello user";
    }

    @GetMapping("save")
    public void saveData(){
        this.redisUtils.set("admin_key","admin");
        this.redisUtils.set("user_key","user");
    }

}
