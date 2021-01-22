package com.savan.PaymentService.controller;

import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/payment-provider")
public class PaymentController {
    
    @GetMapping("/payNow/{price}")
    public String payNow(@PathVariable int price){
        return "Payment with "+price+" amount is successful!";
    }
    
}
