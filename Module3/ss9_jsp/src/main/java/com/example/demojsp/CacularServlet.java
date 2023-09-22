package com.example.demojsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "CacularServlet", value = "/CacularServlet")
public class CacularServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        double number1 = Double.parseDouble(request.getParameter("num1"));
        double number2 = Double.parseDouble(request.getParameter("num2"));
        double result = number1+number2;
        request.setAttribute("kq", result);
        RequestDispatcher requestDispatcher = request.getRequestDispatcher("/index.jsp");
        requestDispatcher.forward(request,response);
    }
}
