package by.it_academy.jd2.web;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;


@WebServlet(name = "PrintServletV1", urlPatterns = "/printNameV1")
public class PrintServletV1 extends HttpServlet {
    private String NAME_PARAMETER = "name";


    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException,
            IOException {

        resp.setContentType("text/html");
        PrintWriter writer = resp.getWriter();

        String[] names = req.getParameterMap().get(NAME_PARAMETER);

        if (names != null) {
            for (String name : names) {
                writer.write("<p>" + NAME_PARAMETER + ": " + name + "</p>");
            }
        }


    }
}
