package com.example.myapp;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping
@Controller
public class myappController {
    @GetMapping("/")
    public String home(){
        return "home";
    }
}
