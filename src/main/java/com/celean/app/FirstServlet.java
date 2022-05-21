package com.celean.app;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class FirstServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.getWriter().println("<html><body>");
        for (int i = 0;i<10;i++){
            resp.getWriter().println("<h1>" + i + "</h1");
        }
        resp.getWriter().println("</body></html>");
    }

    @Override
    public void init() throws ServletException {
        super.init();
    }
}
