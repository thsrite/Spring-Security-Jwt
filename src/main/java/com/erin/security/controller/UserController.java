package com.erin.security.controller;

import com.erin.security.pojo.UserInfo;
import com.erin.security.service.impl.IUserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("user")
public class UserController {

    @Autowired
    private IUserServiceImpl userService;


    @GetMapping
    public UserInfo getUser() {
        return this.userService.findUserById(0L);
    }

}
