<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%
    String user = (String) session.getAttribute("user");

    if(user == null) {
        response.sendRedirect("index.jsp");
        return;
    }
%>

<html>
<head>
    <title>Welcome</title>
</head>
<body>

<h2>Welcome, <%= user %></h2>

<p>Your session ID is:
<b><%= session.getId() %></b></p>

<p>Session Created At:
<b><%= new java.util.Date(session.getCreationTime()) %></b></p>

<p>Last Access Time:
<b><%= new java.util.Date(session.getLastAccessedTime()) %></b></p>

<a href="logout.jsp">Logout</a>

</body>
</html>