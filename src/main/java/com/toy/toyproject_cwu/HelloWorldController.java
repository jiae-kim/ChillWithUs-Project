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

    @RequestMapping("/detail.vi")
    public String videoDetail(Model model){
        return "videoDetail";
    }

    @RequestMapping("/enrollForm.us")
    public String userEnrollForm(Model model){return "/views/user/userEnrollForm";}

    @RequestMapping("login.us")
    public String login(Model model){return "/views/user/login";}


}
