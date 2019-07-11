<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<%@page import="java.util.Date" %>
<%@page isErrorPage="true" %>
<%@page info="Just for Demo" %>
<%@page session="true" %>

<body>
<h1>
Directive Demo
</h2>
<hr>
<h2>
Todays date :<%=new Date() %>
Exception : <%= exception %>
Information :<%= getServletInfo()  %>
Session id :<%= session.getId() %>
<hr>
<%@include file="demo.jsp" %>
<%@include file="login.html" %>
</h2>
</body>
</html>