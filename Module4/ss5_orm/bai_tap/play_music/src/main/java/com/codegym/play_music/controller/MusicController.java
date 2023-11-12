package com.codegym.play_music.controller;

import com.codegym.play_music.model.Music;
import com.codegym.play_music.service.IMusicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.Resource;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import java.util.List;


@Controller
@RequestMapping("/music")
public class MusicController {

    @Autowired
    private IMusicService IMusicService;

    @GetMapping("/home")
    public ModelAndView showAll() {
        List<Music> music = IMusicService.getAllSong();
        ModelAndView modelAndView = new ModelAndView("index", "res", music);
        return modelAndView;
    }

    @GetMapping("/form")
    public String viewForm(Model model) {
        model.addAttribute("song", new Music());
        return "form";
    }

    @PostMapping("/save")
    public String add(@ModelAttribute("song")Music song) {
        IMusicService.addSong(song);
        return "redirect:/music/home";
    }

    @GetMapping("/file/{code}")
    public ResponseEntity<Resource> playMp3(HttpServletRequest request, @PathVariable String code) {
        return IMusicService.downloadFile(request.getServletContext(), code);
    }
}