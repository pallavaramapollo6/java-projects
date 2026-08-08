<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <title>Hello Page</title>
</head>
<body>
 
<%
    String name = request.getParameter("name");
    if (name == null || name.isEmpty()) {
        name = "Guest";
    }
%>
 
<h1>Hello, <%= name %>!</h1>
<form method="get" action="">
    <label for="name">Enter your name: </label>
    <input type="text" id="name" name="name" />
    <input type="submit" value="Submit" />
</form>
</body>
</html>
