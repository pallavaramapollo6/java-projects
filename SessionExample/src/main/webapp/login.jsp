<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
    String username = request.getParameter("username");

    if(username != null && !username.equals("")) {
        session.setAttribute("user", username);
        response.sendRedirect("welcome.jsp");
    } else {
        out.println("Invalid Username");
    }
%>