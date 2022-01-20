<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ page import="java.util.*, java.text.*" %>
<%@ page import="org.example.Difference" %>
<html>
<head>
    <meta charset="UTF-8">
    <title>Результат разности</title>
    <link rel="stylesheet" href="styles.css">
</head>
<body>
<%
    Difference result = (Difference) session.getAttribute("Difference");
    if (result == null) {%>
<meta http-equiv="refresh" content="5; URL=index.html"/>
<h1>Ошибка!</h1>
<li><a href="index.html">Домашняя страница</a></li>
<%
} else {
%>
<%result.subtract();%>
<h1>Результат разности</h1>

<p>Вы ввели: <% out.println(result.getReduced() + " - " + result.getDeductible()); %>

<p>Результат: <% out.println(result.getResult()); %>
<li><a href="result.xml">Скачать XML</a></li>
<li><a href="index.html">Домашняя страница</a></li>
<%
    }
%>
</body>
</html>
