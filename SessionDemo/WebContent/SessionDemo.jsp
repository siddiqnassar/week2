<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%@page import="java.util.Date" %>
<h1>Session Demo</h1>
<hr>
<h3>
Session Id : <%= session.getId() %><br>

Created at : <%= new Date(session.getCreationTime()) %><br>
current Time : <%= new Date() %><br>

Last Access Time : <%= new Date(session.getLastAccessedTime())%><br>

Is it new : <%=session.isNew() %><br>
<% //session.invalidate();
     session.setMaxInactiveInterval(5);
%>

</h3>
</body>
</html>