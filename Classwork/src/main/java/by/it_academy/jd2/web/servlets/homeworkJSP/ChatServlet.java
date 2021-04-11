package by.it_academy.jd2.web.servlets.homeworkJSP;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;


@WebServlet(name ="ChatServlet", urlPatterns = "/chat")
public class ChatServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String firstName = req.getParameter("firstName");
        String lastName = req.getParameter("lastName");
        resp.setContentType("text/html");
        PrintWriter writer = resp.getWriter();
        writer.write("<p><span style='color: blue;'>HelloView, " + lastName + " " + firstName + "!</span></p>");
    }

}
