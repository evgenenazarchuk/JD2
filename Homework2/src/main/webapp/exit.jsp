<%@ page import="by.it_academy.jd2.web.servlets.homeworkJSP.View" %>
<!DOCTYPE html>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>
    <title>Proga</title>
    <meta charset="utf-8">
</head>
<jsp:useBean id="user" class="by.it_academy.jd2.web.servlets.homeworkJSP.User" scope="application"/>
<body>

Пользователь: <%= user.getUser()%> <br>
написал следущие сообщения:<br>

<%=(String)request.getSession().getAttribute("list")%><br>
<br>
<a href="login.jsp">Перейти к авторизиции</a>
</body>
</html>