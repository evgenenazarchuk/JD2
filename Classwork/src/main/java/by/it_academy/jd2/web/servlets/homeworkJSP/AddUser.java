package by.it_academy.jd2.web.servlets.homeworkJSP;

import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

//import static org.graalvm.compiler.options.OptionType.User;

public class AddUser extends Dispatcher {

    public String getServletInfo(){

        return "Add user servlet";

    }

    public void doPost(HttpServletRequest request, HttpServletResponse response)

            throws ServletException, IOException {

        ServletContext ctx = getServletContext();

        if (request.getParameter("save")!=null){

            String user = request.getParameter("user");

            String password = request.getParameter("password");

            String fio = request.getParameter("fio");

            String date = request.getParameter("calendar");

            User newUser = new User();

            newUser.setUser(user);

            newUser.setPassword(password);

            newUser.setFio(fio);

            newUser.setDate(date);

            ctx.setAttribute("user", newUser);

            boolean res = UserList.addUser(newUser);

            if (res) {

                this.forward("/successRegistration.jsp", request, response);

            } else {

                this.forward("/errorRegistration.jsp", request, response);

            }

        } else if (request.getParameter("cancel")!=null){

            this.forward("/login.jsp", request, response);

        }

    }

}
