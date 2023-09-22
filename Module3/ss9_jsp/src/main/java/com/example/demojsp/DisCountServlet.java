package com.example.demojsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "DisCountServlet", value = "/DisCountServlet")
public class DisCountServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        double listPrice = Double.parseDouble(request.getParameter("listPrice"));
        double discountPercent = Double.parseDouble(request.getParameter("discountPercent"));

        double discountAmount = listPrice * discountPercent * 0.01;

        PrintWriter writer = response.getWriter();
        writer.println("<html>");
        writer.println("Discount Amount: " + discountAmount + "<br>");
        writer.println("Discount Price: " + (listPrice - discountAmount));
        writer.println("</html>");
    }
}
