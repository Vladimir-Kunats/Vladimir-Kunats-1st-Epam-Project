package com.itstep.springboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {

    @RequestMapping("/")
    public String hello(Model model) {
        model.addAttribute("title", "Dear learner");
        model.addAttribute("message", "Welcome to Spring Boot");

        return "hello";
    }
}
