package com.example.demo.controllers;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/params")
public class CatchParamsController {
    
    @GetMapping("/view")
    public String getParams(@RequestAttribute(name = "text1") String string, Map<String, Object> map) {
        map.put("textParam", "Your input param: " + string);
        return "/params/view";
    }

    @ModelAttribute("text")
    public String text() {
        return "Hi bugs";
    }

}
