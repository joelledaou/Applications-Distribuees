package com.example.ejb_statelesssessionbean;

import java.io.*;
import javax.ejb.EJB;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

@WebServlet(name = "helloServlet", value = "/hello-servlet")
public class HelloServlet extends HttpServlet {
    @EJB
    private Hello helloBean = new HelloBean();
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("<html><body>");
        out.println("<h1>" + helloBean.sayHello() + "</h1>");
        out.println("</body></html>");
    }

    public void destroy() {}
}

