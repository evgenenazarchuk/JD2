package by.it_academy.jd2.web.servlets.homeworkJSP;



import by.it_academy.jd2.web.servlets.homeworkJSP.View;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;

@WebServlet(name = "Proga", urlPatterns = "/proga")
public class ProgaServlet extends HttpServlet {
    private final View view = new View();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        getServletContext().getRequestDispatcher("/priloga.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String name = req.getParameter("name");
        if (name.equals("history")) {
            final HttpSession session = req.getSession();
            session.setAttribute("list", view.getAll().toString());
            getServletContext().getRequestDispatcher("/exit.jsp").forward(req, resp);
        } else {
            view.add(name);
            getServletContext().getRequestDispatcher("/priloga.jsp").forward(req, resp);
        }
    }
}
