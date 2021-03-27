package by.it_academy.jd2.classwork_8_MVC;

import by.it_academy.jd2.classwork_8_MVC.view.NameView;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;

@WebServlet(name = "MVC", urlPatterns = "/mvc")
public class MVCServlet extends HttpServlet {
    private final NameView view = new NameView();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        getServletContext().getRequestDispatcher("/mvc.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String name = req.getParameter("name");
        if (name.equals("exit")) {
            final HttpSession session = req.getSession();
            session.setAttribute("list", view.getAll().toString());
            getServletContext().getRequestDispatcher("/exit.jsp").forward(req, resp);
        } else {
            view.add(name);
            getServletContext().getRequestDispatcher("/mvc.jsp").forward(req, resp);
        }
    }
}