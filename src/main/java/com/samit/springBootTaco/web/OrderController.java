package com.samit.springBootTaco.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.samit.springBootTaco.Order;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Controller
@RequestMapping("/orders")
public class OrderController {
    @GetMapping("/current")
    public String createOrder(Model model){
        model.addAttribute("order", new Order());
        return "order";
    }

    @PostMapping
    public String processOrder(Order order){
        log.info("Process order"+ order.toString());
        return "redirect:/";
    }
}
