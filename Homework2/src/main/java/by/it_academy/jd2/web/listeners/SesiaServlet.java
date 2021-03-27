package by.it_academy.jd2.web.listeners;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;


import java.beans.Encoder;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.URL;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.util.Arrays;
import java.util.concurrent.TimeUnit;

@WebServlet(name = "SesiaServlet", urlPatterns = "/sessia")
public class SesiaServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {


        String firstName = req.getParameter("firstName");
        String lastName = req.getParameter("lastName");

        HttpSession fSessia = req.getSession();
        HttpSession lSessia = req.getSession();

        resp.setContentType("text/html");
        PrintWriter writer = resp.getWriter();


        if (lastName == null || firstName == null) {

            if (!fSessia.isNew() || !lSessia.isNew()) {

                String fSess = (String) fSessia.getAttribute("firstName");
                String lSess = (String) lSessia.getAttribute("lastName");

                writer.write("<p><span style='color: red;'>HelloView, " + lSessia.getMaxInactiveInterval()+ "!</span></p>");

            }
            if (lastName == null || firstName == null) {

                throw new IllegalArgumentException("Нет пораметров");
            }


        } else {


            fSessia.setAttribute("firstName", firstName);

            lSessia.setAttribute("lastName", lastName);


            writer.write("<p><span style='color: red;'>HelloView, " + lastName + " " + firstName + "!</span></p>");

        }

    }
}