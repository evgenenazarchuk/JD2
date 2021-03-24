<%@ page import="by.it_academy.jd2.classwork_8_MVC.view.NameView" %>
<!DOCTYPE html>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>


<html>
<head>
    <title>MVC</title>
    <meta charset="utf-8">
</head>
<body>
<%=(String)request.getSession().getAttribute("list")%>
</body>
</html>