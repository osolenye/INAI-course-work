package com.example.demo.controllers;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@org.springframework.stereotype.Controller
public class Controller {
    @GetMapping("/main")
    public String main(Model model){
        return "main";
    }
    @GetMapping("/templates")
    public String templates(Model model){
        return "templates";
    }
    @GetMapping("/profile")
    public String profile(Model model){
        return "profile";
    }
}
