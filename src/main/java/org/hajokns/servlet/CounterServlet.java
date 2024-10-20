package org.hajokns.servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet("/track")
public class CounterServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
        throws IOException, ServletException {
        HttpSession session = request.getSession(true);

        Integer counter = (Integer) session.getAttribute("counter");
        counter = (counter != null) ? counter + 1 : 1;

        session.setAttribute("counter", counter);

        request.setAttribute("counter", counter);

        request.getRequestDispatcher("/WEB-INF/views/track.jsp").forward(request, response);
    }

}
