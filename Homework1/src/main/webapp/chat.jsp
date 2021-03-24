<!DOCTYPE html>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ page import="java.util.*, java.text.*" %>
<html>
<body>
<%
    if (request.getSession().getAttribute("send") != null) {
        if ((Boolean) request.getSession().getAttribute("send")) {
            out.println("<p><span style='color: red;'>Cообщение отправленно!</span></p>");
        }
        request.getSession().setAttribute("send", null);
    }
%>
<FORM action="chat" method=POST>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Страница переписки</title>
</head>
<h1>Давай пообщаемся</h1>
<jsp:useBean id="user" class="by.it_academy.jd2.web.servlets.homeworkJSP.User" scope="application"/>
Привет: <%= user.getUser()%><br>
<table style="with: 50%">
<tr>
            <td>Тема:</td>
            <td><input type="text" name="tema" size="25" /></td>
        </tr>
        <tr>
            <td>Сообщение:</td>
            <td><input type="text" name="message" size="50" /></td>
        </tr>
<tr>
<th><small>
<input type="submit" name="submit" value="Отправить сообщение">
</small>
</table>
</body>
</html>