package by.it_academy.jd2.web;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;



import java.io.IOException;
import java.io.PrintWriter;

import java.util.concurrent.TimeUnit;

@WebServlet(name = "CookieServlet", urlPatterns = "/cook")
public class CookieServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws  IOException {

        String lastName = req.getParameter("lastName");
        String firstName = req.getParameter("firstName");


        Cookie lastNam = new Cookie("lastName", lastName);
        Cookie firstNam = new Cookie("firstName", firstName);

        resp.setContentType("text/html");
        PrintWriter writer = resp.getWriter();


        if (lastName == null || firstName == null) {
            Cookie[] coc = req.getCookies();
            Cookie cc = null;
            if (coc != null) {
                for (Cookie c : coc) {
                    if (c.getName().equals(lastNam.getName()) || c.getName().equals(firstNam.getName())) {
                        cc = c;
                        writer.write("<p><span style='color: red;'>HelloView, " + cc.getValue()  + "!</span></p>");
                    }


                }

            } else {
                writer.write("<p><span style='color: red;'>Sorry!!!</span></p>");
            }


        } else {
            lastNam.setMaxAge(Math.toIntExact(TimeUnit.DAYS.toSeconds(1)));
            resp.addCookie(lastNam);

            firstNam.setMaxAge(Math.toIntExact(TimeUnit.DAYS.toSeconds(1)));
            resp.addCookie(firstNam);




         writer.write("<p><span style='color: red;'>HelloView, " + firstName + " " + lastName + "!</span></p>");

        }

    }
}

