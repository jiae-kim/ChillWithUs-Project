package com.toy.toyproject_cwu.chat.controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.stereotype.Controller;

import javax.servlet.http.HttpSession;
@Controller
public class ChatController {

    @RequestMapping("openChat.cht")
    public String OpenChat(Model model){
        return "views/chat/chatRoom";
    }
}
