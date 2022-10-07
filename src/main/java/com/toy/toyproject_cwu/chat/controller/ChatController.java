package com.toy.toyproject_cwu.chat.controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;

public class ChatController {

    @RequestMapping("openChat.cht")
    public String Modal(){
        return "/views/chat/chatRoom";
    }
}
