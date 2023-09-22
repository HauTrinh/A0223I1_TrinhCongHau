package com.example.bai_1.controller;

import com.example.bai_1.model.Student;
import com.example.bai_1.repository.IStudentRepository;
import com.example.bai_1.repository.StudentRepository;
import com.example.bai_1.service.IStudentService;
import com.example.bai_1.service.StudentService;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet(name = "StudentServlet", value = "")
public class StudentServlet extends HttpServlet {
    private IStudentService iStudentService = new StudentService();
    private IStudentRepository iStudentRepository = new StudentRepository();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        String action = request.getParameter("action");
        if (action == null) {
            action = "";
        }
        switch (action) {
            case "showFormCreate":
                showFormCreate(request, response);
                break;
            default:
                display(request, response);
        }

    }

    private void showFormCreate(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        RequestDispatcher requestDispatcher = request.getRequestDispatcher("create.jsp");
        requestDispatcher.forward(request, response);
    }

    private void display(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<Student> list = iStudentService.display();
        request.setAttribute("list", list);
        RequestDispatcher requestDispatcher = request.getRequestDispatcher("/index.jsp");
        requestDispatcher.forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        if (action == null) {
            action = "";
        }
        switch (action) {
            case "create":
                create(request, response);
                break;
            default:
                display(request, response);
        }
    }

    private void create(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<Student> students = new ArrayList<>();
        int id = students.size() + 1;
        String name = request.getParameter("name");
        boolean gender = request.getParameter("gender").equals("male");
        double point = Double.parseDouble(request.getParameter("point"));
        Student student = new Student(id, name, gender, point);
        iStudentService.save(student);
        response.sendRedirect("/");
    }
}
