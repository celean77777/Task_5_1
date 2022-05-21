package com.celean.app;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "FirstServlet", urlPatterns = "/first_servlet")
public class FirstServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        resp.setContentType("text/html");
        for (int i = 0; i<10; i++) {
            Product prd = new Product(i, "AnyProduct", 123);
            resp.getWriter().println("<html><body><h1>" + prd.toString() + "</h1></body></html>");
        }
    }

    @Override
    public void init() throws ServletException {
        super.init();
    }
}
