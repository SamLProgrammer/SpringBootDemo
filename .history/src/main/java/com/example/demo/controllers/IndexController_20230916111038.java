package com.example.demo.controllers;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.models.User;

@Controller
@RequestMapping("/app")
public class IndexController {

    @GetMapping("/index")
    public String index(Map<String,Object> map) {
        map.put("text", "Hello Spring");
        return "index";
    }
    
    @GetMapping("/profile")
    public String profile(Map<String, Object> map) {
        User user = new User("Samuel", "López", "xxxx");
        map.put("user", user);
        map.put("text", "Hi Java Nuvs");
        return "profile";
    }
}
