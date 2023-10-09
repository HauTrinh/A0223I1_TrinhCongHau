package com.codegyn.bai_1.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class CalculatorServlet {
   @GetMapping("calculator")
    public String showFormExchange() {
        return "calculator";
    }

   @PostMapping("calculator")
    public String exchange(@RequestParam double usd, Model model) {
        double usd2 = usd * 20000;
        model.addAttribute("vnd", usd2);
        return "calculator";
    }
}
