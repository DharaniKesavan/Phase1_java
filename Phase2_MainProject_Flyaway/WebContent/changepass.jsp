<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Change password page</title>
</head>
<body style="text-align:center">
<form action="<%= request.getContextPath() %>/Changepassword">
<h2>Change password</h2>
<%
	String s1  = (String) session.getAttribute("error1");
	String s2  = (String) session.getAttribute("error2");
	if (s1 == "1"){ %>
  		<div><b>Enter valid Old Password!</b><br><br></div>
	<% } if (s2 == "2"){%>
		<div><b>New password doesn't match with confirm password!</b><br><br></div>
	<%} 
%>
Enter Old Password:
<input type="password" id="pass1" name="oldpass"  required/><br><br>
Enter New Password:
<input type="password" id="pass2" name="newpass"  required/><br><br>
Confirm New Password:
<input type="password" id="pass3" name="conpass"  required /><br><br>
<input type="submit" value="Submit"/><br><br>
</form>
</body>
</html>