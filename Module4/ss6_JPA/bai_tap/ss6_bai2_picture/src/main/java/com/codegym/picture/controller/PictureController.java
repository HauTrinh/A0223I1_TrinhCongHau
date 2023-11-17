package com.codegym.picture.controller;

import com.codegym.picture.model.Picture;
import com.codegym.picture.service.IPictureService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;


@Controller
public class PictureController {
    @Autowired
    private IPictureService pictureService;

    @GetMapping("/home")
    public String show(@RequestParam(defaultValue = "0",required = false) int page, Model model){
        Pageable pageable = PageRequest.of(page,3);
        Page<Picture> Commentpage = pictureService.findAll(pageable);
        model.addAttribute("Commentpage",Commentpage);
        model.addAttribute("listPoint",new Integer[]{1,2,3,4,5});
        model.addAttribute("picture",new Picture());
        return "display";
    }

    @PostMapping("/create")
    public String Create(@ModelAttribute Picture picture){
        pictureService.save(picture);
        return "redirect:/home";
    }

    @GetMapping("/like/{id}")
    public String saveLike(@PathVariable Integer id){
        Picture picture = pictureService.findById(id);
        if(picture.getLike() == null) {
            picture.setLike(1);
        } else {
            picture.setLike(picture.getLike()+1);
        }
        pictureService.save(picture);
        return "redirect:/home";
    }

    @GetMapping("/dislike/{id}")
    public String saveDislike(@PathVariable Integer id){
        Picture picture = pictureService.findById(id);
        if(picture.getDislike() == null) {
            picture.setDislike(1);
        } else {
            picture.setDislike(picture.getDislike()+1);
        }
        pictureService.save(picture);
        return "redirect:/home";
    }
}
