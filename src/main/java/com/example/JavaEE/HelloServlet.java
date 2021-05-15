package com.example.JavaEE;

import Logic.Cart;

import java.io.*;
import javax.servlet.ServletException;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

@WebServlet(name = "helloServlet", value = "/hello-servlet")
public class HelloServlet extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        HttpSession session = request.getSession();

        Cart cart = (Cart)session.getAttribute("cart");

        String name = request.getParameter("name");

    if (cart == null) {
        cart = new Cart();

        cart.setName(name);

    }

    if(name.equals("F9")) {
        session.setAttribute("cart", cart);
        getServletContext().getRequestDispatcher("/showF9.jsp").forward(request, response);
    } else if(name.equals("FH")) {
        session.setAttribute("cart", cart);
        getServletContext().getRequestDispatcher("/showFH.jsp").forward(request, response);
    } else if(name.equals("SH")) {
        session.setAttribute("cart", cart);
        getServletContext().getRequestDispatcher("/showSH.jsp").forward(request, response);
    }



    }
}