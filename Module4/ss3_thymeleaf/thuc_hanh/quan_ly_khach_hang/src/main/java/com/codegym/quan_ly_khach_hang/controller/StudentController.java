package com.codegym.quan_ly_khach_hang.controller;

import com.codegym.quan_ly_khach_hang.model.Student;
import com.codegym.quan_ly_khach_hang.service.IStudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.List;

@Controller
@RequestMapping("/student")
public class StudentController {
    @Autowired
    private IStudentService studentService;

//    @ModelAttribute("classList")
//    public String[] getListStudent(){
//        return new String[]{"A02","A03","A04"};
//    }
//
//    @ModelAttribute("languages")
//    public String[] getListLanguage(){
//        return new String[]{"JS","Java","PHP"};
//    }

    @GetMapping
    public ModelAndView showList(){
        List<Student> studentList = studentService.findAll();
        ModelAndView modelAndView = new ModelAndView("list", "studentList", studentList);
        return  modelAndView;
    }

    @GetMapping("/create")
    public String showFormCreate(Model model) {
        model.addAttribute("newStudent", new Student());
        model.addAttribute("classList", new String[]{"A02","A03","A04","C04","C05","C06"});
        model.addAttribute("languages", new String[]{"JS","Java","PHP"});
        return "create";
    }

    @PostMapping("/create")
    public String save(@ModelAttribute("newStudent") Student student,
                       RedirectAttributes redirectAttributes){
        studentService.add(student);
        redirectAttributes.addFlashAttribute("mess","Created Success" );
        return "redirect:/student";
    }
    @GetMapping("/detail")
    public String detail1(@RequestParam(name = "id", required = false, defaultValue = "-1") int detailId,
                          Model model){
        Student student = studentService.findById(detailId);
        model.addAttribute("student", student);
        return "detail";
    }

    @GetMapping("/detail/{id}")
    public String detail2(@PathVariable int id, Model model){
        Student student = studentService.findById(id);
        model.addAttribute("student", student);
        return "detail";
    }

    @GetMapping("/edit/{studentid}")
    public String edit(@PathVariable int studentid,
                          Model model){
        Student student = studentService.findById(studentid);
        model.addAttribute("edit", student);
        model.addAttribute("classList", new String[]{"A02","A03","A04","C04","C05","C06"});
        model.addAttribute("languages", new String[]{"JS","Java","PHP"});
        return "edit";
    }

    @PostMapping("/edit")
    public String update(@ModelAttribute("edit") Student student,
                         RedirectAttributes redirectAttributes){
        studentService.update(student);
        redirectAttributes.addFlashAttribute("mess","Update Success" );
        return "redirect:/student";
    }

    @GetMapping("/delete/{studentid}")
    public String delete(@PathVariable int studentid,
                         RedirectAttributes redirectAttributes){
        Student student = studentService.findById(studentid);
        studentService.delete(studentid);
        redirectAttributes.addFlashAttribute("mess","Delete Success " + student.getName());
        return "redirect:/student";
    }
    @GetMapping("/search")
    public String search(@RequestParam("keyword") String keyword, Model model) {
        List<Student> searchResults;
        if (keyword != null && !keyword.isEmpty()) {
            searchResults = studentService.search(keyword);

        } else {
            searchResults = studentService.findAll();
        }
        model.addAttribute("studentList", searchResults);
        return "list";
    }
}
