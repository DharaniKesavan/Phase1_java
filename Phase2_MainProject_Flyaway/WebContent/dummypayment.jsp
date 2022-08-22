<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Payment page</title>
</head>
<body style="text-align:center">
<form action="<%= request.getContextPath() %>/bookingdetails">
<img src="https://image.pngaaa.com/835/2651835-middle.png" width="80" height="80"><br><br><br>
 Rs.<%= session.getAttribute("price")%>
<h2>Amount paid Successfully!!!</h2>
<input type="submit" value="Done" />
</form>
</body>
</html>