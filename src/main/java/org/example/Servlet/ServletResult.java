package org.example.Servlet;

import org.example.Difference;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet("/result.html")
public class ServletResult extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            // получаем сессию
            HttpSession session = request.getSession();
            // получаем объект
            Difference result = (Difference) session.getAttribute("разность");
            result.subtract();
            request.getSession(true).setAttribute("разность", result);
        }catch (NullPointerException e) {
        }finally {
            response.sendRedirect("result.jsp");
        }
    }
}
