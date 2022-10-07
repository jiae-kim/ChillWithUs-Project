package com.toy.toyproject_cwu.payment.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PaymentController {
    //결제 모달 호출
    @RequestMapping("openModal.pay")
    public String Modal() {
        return "views/pay/payment";
    }

}
