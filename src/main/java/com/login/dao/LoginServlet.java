package com.login.dao;

import Logic.Member;
import com.login.dao.LoginDao;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "LoginServlet", value = "/login")
public class LoginServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String username = request.getParameter("username");
        String password = request.getParameter("password");

        Member member = new Member(username, password);

        LoginDao dao = new LoginDao();

        if(dao.check(member)) {
            HttpSession session = request.getSession();
            session.setAttribute("username",username);
            response.sendRedirect("successLogin.html");
        }
        else
        {
            response.sendRedirect("register.jsp");
        }
    }
}
