package com.register.dao;

import Logic.Member;
import com.register.dao.RegisterDao;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "com.register.dao.RegistrationServlet", urlPatterns = "/register")
public class RegistrationServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String username = request.getParameter("username");
        String password = request.getParameter("password");

        Member member = new Member(username, password);

        RegisterDao rDao = new RegisterDao();
        String result = rDao.insert(member);
        response.getWriter().print(result);


    }


    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        getServletContext().getRequestDispatcher("/register.jsp").forward(request, response);

    }
}
