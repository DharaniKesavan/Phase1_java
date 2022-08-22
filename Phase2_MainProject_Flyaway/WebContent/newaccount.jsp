<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ include file = "header.jsp" %>
<%@ page import="java.io.*,java.util.*,java.sql.*, com.mysql.jdbc.Driver"%>  
<%@ page import="javax.servlet.http.*,javax.servlet.*" %>    
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>New account</title>
</head>
<body style="text-align:center">
<h2>Create a new account!!!</h2>

<%
	String s1  = (String) session.getAttribute("error1");
	String s2  = (String) session.getAttribute("error2");
	if (s1 == "1"){ %>
  		<div><b>Username already exists!</b><br><br></div>
	<% } if (s2 == "2"){%>
		<div><b>New password doesn't match with confirm password/Password must contain 12 characters!</b><br><br></div>
	<%} 
%>

<form action="<%= request.getContextPath() %>/createaccount">
Enter Username:
<input type="email" name="username" placeholder="Enter emailID only" required/><br><br>
Enter New Password:
<input type="password" id="p1" name="password1" title="Must contain atleast 12 characters" required/><br><br>
Confirm New Password:
<input type="password" id="p2" name="password2" title="Must contain atleast 12 characters"  required /><br><br>
<input type="submit" value="Submit"/><br><br>
</form>
</body>
</html>