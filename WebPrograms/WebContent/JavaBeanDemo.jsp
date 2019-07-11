<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<hi>Java Bean Demo</hi>
<hr>
<h2>
<jsp:useBean id="p1" class="com.controller.JetDemo"></jsp:useBean>
<jsp:setProperty property="name" name="p1" value="Hii"/>
<jsp:setProperty property="age" name="p1" value="pass"/>
Your good name is :<<jsp:setProperty property="name" name="p1"/>
Your password is :<jsp:setProperty property="password" name="p1">
<hr>
<%
com.JetDemo
%>

</h2>
</body>
</html>