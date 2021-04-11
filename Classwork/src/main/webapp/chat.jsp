<!DOCTYPE html>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ page import="java.util.*, java.text.*" %>
<html>
<body>
<FORM action="history" method=POST>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Страница переписки</title>
</head>
<h1>Давай пообщаемся</h1>
<jsp:useBean id="user" class="by.it_academy.jd2.web.servlets.homeworkJSP.User" scope="application"/>
Твой логин: <%= user.getUser()%><br>
<table style="with: 50%">
Введите сообщение<br>
    <input type="text" name="name" required><br><br>
    <br>
<tr>
<th><small>
<input type="submit" name="cancel" value="Отправить сообщение">
</small>
</table>
</body>
</html>