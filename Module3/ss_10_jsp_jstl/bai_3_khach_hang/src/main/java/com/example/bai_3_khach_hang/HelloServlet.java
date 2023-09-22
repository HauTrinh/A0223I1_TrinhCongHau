package com.example.bai_3_khach_hang;

import model.Customer;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

@WebServlet(name = "helloServlet", value = "/hello-servlet")
public class HelloServlet extends HttpServlet {
    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException,IOException {
        List<Customer> list = new ArrayList<>();
        list.add(new Customer("John", "1990-05-15", "123 Main St", "john.jpg"));
        list.add(new Customer("Jane", "1985-10-20", "456 Elm St", "jane.jpg"));
        request.setAttribute("customers", list);
        RequestDispatcher requestDispatcher = request.getRequestDispatcher("/index.jsp");
        requestDispatcher.forward(request,response);
    }


}