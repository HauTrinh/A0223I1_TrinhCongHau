package com.codegym.blog.controller;

import com.codegym.blog.model.Blog;
import com.codegym.blog.model.Category;
import com.codegym.blog.service.BlogService;
import com.codegym.blog.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;
import java.util.Optional;

@Controller
public class BlogController {

    @Autowired
    private BlogService blogService;

    @Autowired
    private CategoryService categoryService;

    @GetMapping("/home")
    public ModelAndView list(@PageableDefault(page = 0, size = 2, sort = "author", direction = Sort.Direction.ASC) Pageable pageable,
                             @RequestParam(defaultValue = "", required = false) String searchName,
                             @RequestParam(defaultValue = "0", required = false) int key) {
                    // sắp xếp tăng theo tên tác giả , nếu trùng thì giảm thèo tuổi
//        Sort.Order orderByAuthor = new Sort.Order(Sort.Direction.ASC, "author");
//        Sort.Order orderByAgeDesc = new Sort.Order(Sort.Direction.DESC, "age");
//        Sort sort = Sort.by(orderByAuthor).and(orderByAgeDesc);
//        pageable = PageRequest.of(pageable.getPageNumber(), pageable.getPageSize(), sort);

        Page<Blog> blog;
        if(key == 0) {
            blog= blogService.findAll(pageable, searchName, searchName);
        }else {
            blog= blogService.getBlogByCat(pageable, key);
        }
        List<Category> categories = categoryService.findAll();
        ModelAndView modelAndView = new ModelAndView("index");
        modelAndView.addObject("blogs", blog);
        modelAndView.addObject("searchName", searchName);
        modelAndView.addObject("categories", categories);
        modelAndView.addObject("key", key);
        // bỏ key ở đây để đẩy lên, nếu như không chọn thì sẽ là 0 và chọn all
        return modelAndView;
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
        modelAndView.addObject("categories", categories);
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
