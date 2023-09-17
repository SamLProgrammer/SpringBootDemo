package com.example.demo.controllers;

import java.util.ArrayList;
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
        User user = new User("Samuel", "López", "test@mail.com");
        map.put("user", user);
        map.put("text", "Hi Java Nuvs");
        return "profile";
    }

    @GetMapping("/usersList")
    public String usersList(Map<String, Object> map) {
        ArrayList<User> usersList = new ArrayList<>();
        usersList.add(new User("Aernas", "Carlos", "carlos@arenas.com"));
        usersList.add(new User("Vasquez", "Carlos", "carlos@vasquez.com"));
        usersList.add(new User("López", "Samuel", "samuel@lopez.com"));
        
        map.put("usersList", usersList);
        map.put("text", "Hi Java Nuvs");
        return "usersList";
    }
}
