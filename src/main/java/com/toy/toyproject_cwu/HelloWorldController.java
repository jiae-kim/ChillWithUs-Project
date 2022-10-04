package com.toy.toyproject_cwu;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.ui.Model;

@Controller
public class HelloWorldController {
    @RequestMapping("/hello")
    public String hello(Model model) {
        model.addAttribute("name", "Hello World!");
        return "index";
    }
}
