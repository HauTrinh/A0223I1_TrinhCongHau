package com.codegym.picture.controller;

import com.codegym.picture.model.Picture;
import com.codegym.picture.repository.IPictureRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/picture")
public class PictureController {
    @Autowired
    private IPictureRepository pictureRepository;

    @GetMapping("")
    public String showList(Model model){
        List<Picture> list = pictureRepository.findAll();
        model.addAttribute("list",list);
        model.addAttribute("comment",new Picture());
        model.addAttribute("listPoint",new Integer[]{1,2,3,4,5});
        return "display";
    }

    @PostMapping("/create")
    public String save(@ModelAttribute("comment") Picture picture){
        pictureRepository.save(picture,true, true);
        return "redirect:display";
    }

    @GetMapping("/like/{id}")
    public String like(@PathVariable Integer id){
        pictureRepository.save(pictureRepository.findById(id),true, false);
        return "redirect:display";
    }

    @GetMapping("/dislike/{id}")
    public String dislike(@PathVariable Integer id){
        pictureRepository.save(pictureRepository.findById(id),false, false);
        return "redirect:display";
    }
}
