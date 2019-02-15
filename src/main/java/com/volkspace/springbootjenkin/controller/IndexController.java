package com.volkspace.springbootjenkin.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController {

    @Value("${application.message:Hello World}")
    private String message = "Hello World";

    @GetMapping("/")
    public String index(ModelMap model) {
        String hello = "Hello, Volk Swagen #2";
        model.addAttribute("hello", hello);
        return "index";
    }
}
