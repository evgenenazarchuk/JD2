package by.it_academy.jd2.web.servlets.homeworkJSP;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

public class Dispatcher extends HttpServlet {

    protected void forward(String fio, HttpServletRequest request, HttpServletResponse response)

            throws ServletException, IOException {

        RequestDispatcher dispatcher = getServletContext().getRequestDispatcher(fio);

        dispatcher.forward(request, response);

    }

}
