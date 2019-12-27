package com.ncu.iqiyi.controller;

import com.ncu.iqiyi.entity.User;
import com.ncu.iqiyi.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    UserService userService;

    @PostMapping("/login")
    public User findById(@RequestParam String username, @RequestParam String password){
        System.out.println(username + password);
        User user = userService.findByUserName(username);
        if(user == null){
            return null;
        }else {
            if(user.getPassword().equals(password)){
                return user;
            }else {
                return null;
            }
        }
    }

    @PostMapping("/register")
    public void register(@RequestParam String username, @RequestParam String password){
        userService.register(username, password);
    }
}
