<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<hi>Scripting Elements</hi>
<hr>
<h2>
<%!
 int a=10;
 int b=20;
 int i=0;
%>
<%
 int sum=a+b;
%>
<h2>Sum is </h2><%=
sum
%>
<h1>Site visit count</h1><%= ++i %>
</h2>
</body>
</html>