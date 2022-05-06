package com.example;

import jakarta.servlet.annotation.WebServlet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

public class Login extends HttpServlet{

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        resp.setStatus(HttpServletResponse.SC_OK);
        resp.setContentType("text/html");

        StringBuilder html = new StringBuilder("");
        String val = "";
        FileReader fr = new FileReader("C:\\Users\\HP\\IdeaProjects\\webApp\\untitled\\src\\main\\java\\com\\example\\form.html");
        BufferedReader br = new BufferedReader(fr);
        while((val = br.readLine()) != null)
            html.append(val);
        String htmlString = html.toString();
        br.close();

        PrintWriter out = resp.getWriter();
        out.println(htmlString);
    }
}
