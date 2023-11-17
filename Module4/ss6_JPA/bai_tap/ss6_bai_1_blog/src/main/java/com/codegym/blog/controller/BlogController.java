package com.codegym.blog.controller;

import com.codegym.blog.model.Blog;
import com.codegym.blog.model.Category;
import com.codegym.blog.service.BlogService;
import com.codegym.blog.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class BlogController {

    @Autowired
    private BlogService blogService;

    @Autowired
    private CategoryService categoryService;

    @GetMapping("/home")
    public String list(Model model) {
        List<Blog> blogList = blogService.findAll();
        model.addAttribute("blogs", blogList);
        return "index";
    }

    @GetMapping("/create")
    public String showCreateForm(Model model) {
        model.addAttribute("blog", new Blog());
        List<Category> categories = categoryService.findAll();
        model.addAttribute("categories", categories);
        return "create";
    }

    @PostMapping("/create")
    public String add(Blog blog) {
        blogService.add(blog);
        return "redirect:/home";
    }

    @GetMapping("/update/{id}")
    public ModelAndView showFormEdit(@PathVariable int id) {
        ModelAndView modelAndView = new ModelAndView("edit", "blog", blogService.findById(id));
        List<Category> categories = categoryService.findAll();
       modelAndView.addObject("categories",categories);
        return modelAndView;
    }

    @PostMapping("/edit")
    public String update(@ModelAttribute("blog") Blog blog) {
        blogService.update(blog);
        return "redirect:/home";
    }

    @GetMapping("/detail/{id}")
    public ModelAndView showFormDetail(@PathVariable int id) {
        ModelAndView modelAndView = new ModelAndView("detail", "blog", blogService.findById(id));
        return modelAndView;
    }

    @PostMapping("/delete")
    public ModelAndView delete(Blog blog) {
        blogService.deleteBlogById(blog.getId());
        ModelAndView modelAndView = new ModelAndView("redirect:/home", "blog", blog);
        return modelAndView;
    }
}
