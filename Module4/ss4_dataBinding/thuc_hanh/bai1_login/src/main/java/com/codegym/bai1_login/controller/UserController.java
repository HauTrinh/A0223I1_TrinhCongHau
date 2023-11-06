package com.codegym.bai1_login.controller;

import com.codegym.bai1_login.model.Login;
import com.codegym.bai1_login.model.User;
import com.codegym.bai1_login.repository.ILoginRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class UserController {
    @Autowired
    private ILoginRepository loginRepository;
    @GetMapping("/home")
    public ModelAndView showFormLogin() {
        ModelAndView modelAndView = new ModelAndView("home", "login", new Login());
        return  modelAndView;
    }

    @PostMapping("/login")
    public ModelAndView login(@ModelAttribute("login") Login login) {
        User u = loginRepository.checkLogin(login);
        if (u == null) {
            ModelAndView modelAndView = new ModelAndView("error");
            return modelAndView;
        } else {
            ModelAndView modelAndView = new ModelAndView("userLogin", "user", u);
            return modelAndView;
        }
    }
}
