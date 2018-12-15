package com.codeup.adlister.controllers;

import com.codeup.adlister.dao.DaoFactory;
import com.codeup.adlister.models.User;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.swing.*;
import java.io.IOException;

@WebServlet(name = "controllers.RegisterServlet", urlPatterns = "/register")
public class RegisterServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // TODO: show the registration form
        request.getRequestDispatcher("WEB-INF/register.jsp").forward(request, response);
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
        // TODO: ensure the submitted information is valid
        // TODO: create a new user based off of the submitted information
        // TODO: if a user was successfully created, send them to their profile

        String userName = request.getParameter("username");
        String email = request.getParameter("email");
        String password = request.getParameter("password");
//        boolean validAttempt;


        if (email.trim().isEmpty() || userName.trim().isEmpty() || password.trim().isEmpty()) {
            response.sendRedirect("/register");
            JOptionPane.showMessageDialog(null, "Please fill out all fields");
        } else {
            User user = new User(
                    userName,
                    email,
                    password
            );
            DaoFactory.getUserDao().insert(user);
            response.sendRedirect("/profile");
        }

    }
}
