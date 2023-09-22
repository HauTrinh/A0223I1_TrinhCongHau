package com.example.bai_2_customer;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet(name = "DisplayServlet", value = "/DisplayServlet")
public class DisplayServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<Customer> customers = new ArrayList<>();
        Customer cus1 = new Customer("John", "1990-05-15", "123 Main St", "john.jpg");
        Customer cus2 = new Customer("Jane", "1985-10-20", "456 Elm St", "jane.jpg");
        customers.add(cus1);
        customers.add(cus2);
        request.setAttribute("customers", customers);
        RequestDispatcher requestDispatcher = request.getRequestDispatcher("index.jsp");
        requestDispatcher.forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
