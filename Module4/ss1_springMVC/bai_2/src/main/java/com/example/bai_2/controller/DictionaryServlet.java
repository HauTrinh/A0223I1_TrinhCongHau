package com.example.bai_2.controller;

import com.example.bai_2.service.DictionaryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class DictionaryServlet {
    @Autowired
    private DictionaryService dictionaryService;
    @RequestMapping(value = "/translation", method = RequestMethod.GET)
    public String showForm() {
        return "dictionary";
    }

    @PostMapping("translation")
    public String find(@RequestParam String txtSearch, Model medel) {
        String result = dictionaryService.search(txtSearch);
        if (result != null) {
            medel.addAttribute("word", result);
        } else {
            medel.addAttribute("word", "not found");
        }
        return "dictionary";
    }
}
