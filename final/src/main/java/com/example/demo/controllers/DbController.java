package com.example.demo.controllers;

import com.example.demo.PostRepository;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/demo")
public class DbController {
    private PostRepository postRepository;

}
