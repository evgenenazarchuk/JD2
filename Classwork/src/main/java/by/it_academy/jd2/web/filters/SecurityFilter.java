package by.it_academy.jd2.web.filters;

import jakarta.servlet.*;

import java.io.IOException;

public class SecurityFilter implements Filter {
    private boolean active = false;

    @Override
    public void init(FilterConfig config) throws ServletException {
        String act = config.getInitParameter("active");
        if (act != null) {
            active = (act.toUpperCase().equals("TRUE"));
        }
    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        if (active) {
            System.out.println("Все сделано верно");
        }
        chain.doFilter(request, response);
    }
}
