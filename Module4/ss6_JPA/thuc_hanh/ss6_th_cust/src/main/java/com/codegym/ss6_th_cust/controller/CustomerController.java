package com.codegym.ss6_th_cust.controller;

import com.codegym.ss6_th_cust.model.Customer;
import com.codegym.ss6_th_cust.service.ICustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.List;

@Controller
@RequestMapping("/customer")
public class CustomerController{

    @Autowired
    private ICustomerService customerService;

    @GetMapping("")
    public ModelAndView listCustomers() {
        List<Customer> customers = customerService.findAll();
        ModelAndView modelAndView = new ModelAndView("/customer/list");
        modelAndView.addObject("customers", customers);
        return modelAndView;
    }

    @GetMapping("/create")
    public String showCreateForm(Model model) {
        model.addAttribute("customerNew", new Customer());
        return "/customer/create";
    }

    @PostMapping("/create")
    public String saveCustomer(@ModelAttribute("customerNew") Customer customer,
                               RedirectAttributes redirectAttributes) {
        customerService.save(customer);
        redirectAttributes.addFlashAttribute("message", "New customer created successfully");
        return "redirect:/customer";
    }

    @GetMapping("/edit/{id}")
    public ModelAndView showEdit(@PathVariable("id") int customerid) {
        Customer customer = customerService.findById(customerid);
        if (customer != null) {
            ModelAndView modelAndView = new ModelAndView("/customer/edit");
            modelAndView.addObject("editCustomer", customer);
            return modelAndView;

        } else {
            ModelAndView modelAndView = new ModelAndView("/error.404");
            return modelAndView;
        }
    }
    @PostMapping("/edit")
    public String updateCustomer(@ModelAttribute("editCustomer") Customer customer,
                                 RedirectAttributes redirectAttributes) {
        customerService.save(customer);
        redirectAttributes.addFlashAttribute("message", "Customer updated successfully");
        return "redirect:/customer";
    }

    @GetMapping("/delete/{id}")
    public String showDelete(@PathVariable("id") int customerid, Model model){
        model.addAttribute("deleteCustomer", customerService.findById(customerid));
        return "customer/delete";
    }

    @PostMapping("/delete")
    public String deleteCustomer(@ModelAttribute("deleteCustomer") Customer customer,
                                 RedirectAttributes redirectAttributes) {
        customerService.remove(customer.getId());
        redirectAttributes.addFlashAttribute("message", "Customer deleted successfully");
        return "redirect:/customer";
    }

    @GetMapping("/search")
    public String search(@RequestParam("keyword") String keyword, Model model) {
        List<Customer> searchResults;
        if (keyword != null && !keyword.isEmpty()) {
            searchResults = customerService.search(keyword);

        } else {
            searchResults = customerService.findAll();
        }
        model.addAttribute("customers", searchResults);
        return "/customer/list";    }
}
