package com.codygym.bai3_mudical.controller;

import com.codygym.bai3_mudical.model.Medical;
import com.codygym.bai3_mudical.service.MedicalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.List;
import java.util.Optional;

@Controller
public class MedicalController {
    private MedicalService medicalService;

    @Autowired
    private MedicalController(MedicalService medicalService) {
        this.medicalService = medicalService;
    }

    @GetMapping("/home")
    public ModelAndView home() {
        List<Medical> medicalList = medicalService.findAll();
        ModelAndView modelAndView = new ModelAndView("list", "medicalList", medicalList);
        return modelAndView;
    }

    @GetMapping(path = {"/create",})
    public ModelAndView viewCreate(@PathVariable(required = false) Optional<Integer> id,  Medical medical) {
        if (id.isPresent()) {
            Optional<Medical> medicalOptional = medicalService.findById(id.get());
            if (medicalOptional.isPresent()) {
                medical = medicalOptional.get();
            }

        }
        ModelAndView modelAndView = new ModelAndView("index", "createM", medical);
        return modelAndView;
    }

    @GetMapping("/edit/{id}")
    public String edit(@PathVariable(required = false) int id, Model model) {
        model.addAttribute("edit", medicalService.findById2(id));
        return "edit";
    }

    @PostMapping("/edit")
    public String update(@ModelAttribute("edit") Medical medical, RedirectAttributes redirectAttributes) {
        medicalService.update(medical);
        redirectAttributes.addFlashAttribute("mess", "Update successful");
        return "redirect:/home";
    }


    @PostMapping
    public String save(@ModelAttribute("createM") Medical medical, RedirectAttributes redirectAttributes) {
        medicalService.save(medical);
        redirectAttributes.addFlashAttribute("mess", "Create successful");
        return "redirect:/home";
    }

}
