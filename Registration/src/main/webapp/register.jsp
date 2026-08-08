<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <title>User Registration</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            margin: 50px;
        }
        form {
            max-width: 400px;
            margin: auto;
            padding: 20px;
            background-color: #f4f4f4;
            border-radius: 5px;
            box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
        }
        input {
            width: 100%;
            padding: 10px;
            margin: 10px 0;
            border: 1px solid #ddd;
            border-radius: 5px;
        }
        button {
            width: 100%;
            padding: 10px;
            background-color: #4CAF50;
            color: white;
            border: none;
            border-radius: 5px;
        }
        .message {
            color: red;
            font-size: 14px;
            text-align: center;
        }
    </style>
</head>
<body>
 
<h2>User Registration</h2>
<!--
Ensure action="Register" matches with the annotation given @WebServlet("/Register") or web.xml configuration while creating Dynamic Web project creation or by manually adding it in Servlet.java
class that extends HttpServlet
 -->
<form action="Register" method="post">
    <label for="name">Name:</label>
    <input type="text" id="name" name="name" required />
 
    <label for="email">Email:</label>
    <input type="email" id="email" name="email" required />
 
    <label for="password">Password:</label>
    <input type="password" id="password" name="password" required />
 
    <button type="submit">Register</button>
</form>
 
<div class="message">
zZ    <%= request.getAttribute("message") != null ? request.getAttribute("message") : "" %>
</div>
 
</body>
</html>
