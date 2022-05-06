package com.example;

import jakarta.servlet.annotation.WebServlet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/loggedIn")
public class LoggedIn extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String inputUsername = req.getParameter("username");
        String inputPassword = req.getParameter("password");
        String response = "";

        if(inputUsername.equals("shrey") && inputPassword.equals("patel"))
            response += "<h1>You are logged in</h2>";
        else
            response += "<h1>Username or password is incorrect</h2>";

        PrintWriter writer = resp.getWriter();
        writer.println(response);
    }
}
