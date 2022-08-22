<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ include file = "header.jsp" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Admin login</title>
</head>
<body style="text-align:center">
<h2>Welcome to Admin Page!!!</h2>
<%
  if (request.getParameter("error") != null)
          out.println("<b>Enter valid Username or Password!</b><br><br>");
%>
<form action="<%= request.getContextPath() %>/Admincheck">
Username:
<input type="text" name="adminname"/><br><br>
Password:
<input type="password" name="adminpass"/><br><br>
<input type="submit" value="Submit"/><br><br>
</form>
</body>
</html>