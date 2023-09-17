package com.example.demo.controllers;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/params")
public class CatchParamsController {
    
    @GetMapping("/view")
    public String getParams(@RequestParam(name = "text", required = false, defaultValue = "Not Sent") String string, Map<String, Object> map) {
        map.put("textParam", "Your input param: " + string);
        return "/params/view";
    }

    @GetMapping("/")
    public String index() {
        return "params/index";
    }

    @GetMapping("/mix-params")
    public String params(@RequestParam(name="text") String string, @RequestParam(name="number") int number, Map<String, Object> map) {
        map.put("textParam", "Your input text param: " + string + " number param: " + number);
        return "params/index";
    }

    @ModelAttribute("text")
    public String text() {
        return "Hi bugs";
    }

}
