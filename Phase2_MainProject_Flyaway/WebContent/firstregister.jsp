<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ include file = "header.jsp" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Registration check page</title>
</head>
<body style="text-align:center">
<h2>Registration Check!</h2>
<%
  if (request.getParameter("error") != null)
          out.println("<b>User not registered...Kindly register and book!</b><br><br>");
%>
<form action="register.jsp">
<button>Register</button><br><br>
</form>
<form action="<%= request.getContextPath() %>/alreadyregister">
<button>Already Registered</button><br><br>
</form>
</body>
</html>