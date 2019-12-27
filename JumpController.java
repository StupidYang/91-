package com.ncu.iqiyi.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class JumpController {

    @RequestMapping("/")
    public String jumpToIndex(){
        return "search";
    }

    @RequestMapping("/play")
    public String jumpToPlay(){
        return "play";
    }
}
