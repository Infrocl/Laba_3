<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ page import="org.example.Difference" %>

<%
    String x1 = request.getParameter("x1");
    String x2 = request.getParameter("x2");
    try {
        double deductible = Double.parseDouble(x2);
        double reduced = Double.parseDouble(x1);
        request.getSession(true).setAttribute("Difference", new Difference(reduced, deductible));
    } catch (NumberFormatException e) {
        e.printStackTrace();
    } finally {
        response.sendRedirect("result.html");
    }
%>

