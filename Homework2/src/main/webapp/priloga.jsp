<!DOCTYPE html>

<%@ page contentType="text/html; charset=UTF-8" language="java" %>

<%@ page import="java.util.*, java.text.*" %>



<html>

<head>

    <title>Proga</title>

    <meta charset="utf-8">

</head>

<body>

<jsp:useBean id="user" class="by.it_academy.jd2.web.servlets.homeworkJSP.User" scope="application"/>

<form action="proga" method="post">
    Дорогой пользователь: <%= user.getUser()%><br>
    Введите cообщение <br>

    Для просмотра историй сообщений введите "history"<br>
<br>
<br>
    <input type="text" name="name" required><br><br>

    <br>




    <button type="submit">Отправить сообщение</button>

</form>

</body>

</html>