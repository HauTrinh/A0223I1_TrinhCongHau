package com.codegym.bai1_setting_mail.controller;

import com.codegym.bai1_setting_mail.model.Email;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class EmailController {

    @GetMapping
    public ModelAndView home() {
        ModelAndView modelAndView = new ModelAndView("update");
        return modelAndView;
    }

    @GetMapping("/create")
    public String showFormCreate(Model model) {
        model.addAttribute("email", new Email());
        model.addAttribute("languages",new String[]{"EL", "VN", "JP", "CN"});
        model.addAttribute("sizes",new Integer[]{5, 10, 15, 25, 50, 100});
        return "setting_mail";
    }
        @PostMapping("create")
        public ModelAndView save (@ModelAttribute("email") Email e){
            Email email = new Email();
            email = e;
            ModelAndView modelAndView = new ModelAndView("update", "storeEmail", email);
            return modelAndView;
        }


    }
