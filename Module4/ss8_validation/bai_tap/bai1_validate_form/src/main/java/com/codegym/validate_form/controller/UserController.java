package com.codegym.validate_form.controller;

import com.codegym.validate_form.dto.UserDTO;
import com.codegym.validate_form.entity.User;
import com.codegym.validate_form.service.UserService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.validation.Valid;

@Controller
@RequestMapping("/register")
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping
    public ModelAndView showFormCreate(){
        ModelAndView modelAndView = new ModelAndView("index", "registerUser", new UserDTO());
        return modelAndView;
    }

    @PostMapping
    public String save(@Valid @ModelAttribute("registerUser") UserDTO userDTO,
                             BindingResult bindingResult,
                                RedirectAttributes redirectAttributes,
                             Model model){
        // method này dành cho custom validate
//        new UserDTO().validate(userDTO,bindingResult);

        if(bindingResult.hasErrors()){
           model.addAttribute("registerUser", userDTO);
           return "index";
        }
        User user = new User();
        BeanUtils.copyProperties(userDTO, user);
        model.addAttribute("user", user);
        redirectAttributes.addFlashAttribute("mess", "Created Success");
        return "result";
    }

}
