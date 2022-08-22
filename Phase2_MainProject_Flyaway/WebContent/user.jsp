<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ include file = "header.jsp" %>
<%@ page import="java.io.*,java.util.*,java.sql.*, com.mysql.jdbc.Driver"%>  
<%@ page import="javax.servlet.http.*,javax.servlet.*" %>    
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>User login</title>
</head>
<body style="text-align:center">
<h2>Welcome to User Page!!!</h2>
<%
  if (request.getParameter("error") != null)
          out.println("<b>Enter valid Username or Password!</b><br><br>");
%>
<form action="<%= request.getContextPath() %>/checkuser">
Username:
<input type="email" name="username" placeholder="Enter emailID only" required/><br><br>
Password:
<input type="password" name="password" title="Must contain atleast 12 characters" required/><br><br>
<input type="submit" value="Submit"/><br><br>
Doesn't have an account?<a href="newaccount.jsp">Create one</a>
</form>
</body>
</html>