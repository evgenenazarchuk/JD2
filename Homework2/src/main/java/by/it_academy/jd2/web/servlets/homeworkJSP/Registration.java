package by.it_academy.jd2.web.servlets.homeworkJSP;

import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

public class Registration extends Dispatcher {

    public String getServletInfo(){

        return "Registration servlet";

    }

    public void doPost(HttpServletRequest request, HttpServletResponse response)

            throws ServletException, IOException {

        ServletContext ctx = getServletContext();

        if (request.getParameter("login")!=null){

            this.forward("/CheckUser", request, response);

        } else if (request.getParameter("registration")!=null) {

            this.forward("/registration.jsp", request, response);

        }

    }

}