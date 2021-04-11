package by.it_academy.jd2.web;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;


import java.beans.Encoder;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.URL;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.util.Date;
import java.util.concurrent.TimeUnit;

@WebServlet(name = "CookieServlet", urlPatterns = "/demo")
public class Demo extends HttpServlet {
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        Cookie sessionId = new Cookie("session_id", request.getRemoteAddr() + new Date().toString());
        Cookie language = new Cookie("language", request.getLocale().toString());

        response.addCookie(sessionId);
        response.addCookie(language);

        response.setContentType("text/html");

        PrintWriter writer = response.getWriter();

        String title = "Cookies Demo";
        String docType = "<!DOCTYPE html>";

        Cookie[] cookies = request.getCookies();

        writer.println(docType + "<html><head><title>" + title + "</title></head><body>");

        if (cookies != null) {
            writer.println("Cookies");
            for (int i = 0; i < cookies.length; i++) {
                writer.println("<hr/>");
                writer.println("Name: " + cookies[i].getName());
                writer.println("<br/>");
                writer.println("Value: " + cookies[i].getValue());
                writer.println("<hr/>");
            }
        } else {
            writer.println("No cookies");
        }
        writer.println("</body></html>");
    }

    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }

}