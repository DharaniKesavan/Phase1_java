<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ include file = "header.jsp" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>flight page</title>
</head>
<body style="text-align:center">
<h2>Flight details!!!</h2>
<form action="firstregister.jsp">
<% 	String date  = (String) session.getAttribute("date");
	String source  = (String) session.getAttribute("source");
	String dest  = (String) session.getAttribute("dest");
%>
<div><h3>The flight from <%=source%> to <%=dest%> on <%=date%> are listed below : </h3></div>
<table align="center" border = "1px" cellspacing="2" cellpadding="2" style="text-align:center" ><thead>
<tr><th>Flight No</th>
<th>Airline Name</th>
<th>Departure Time</th>
<th>Arrival Time</th>
<th>Class</th>
<th>Ticket Fare</th>
<th>Seats Availability</th>
<th>Book Tickets</th>

</tr></thead>
<% 	ArrayList arrRow  = (ArrayList) session.getAttribute("arrRow");
	ArrayList arrCol = new ArrayList();
	if(arrRow.size() > 0){
		for(int i = 0; i< arrRow.size(); i++){
			arrCol = (ArrayList)arrRow.get(i);
			 %>
			<tbody><tr>
			<td><%= arrCol.get(0)%></td>
			<td><%= arrCol.get(1)%></td>
			<td><%= arrCol.get(5)%></td>
			<td><%= arrCol.get(6)%></td>
			<td><%= arrCol.get(7)%></td>
			<td><%= arrCol.get(8)%></td>
			<td><%= arrCol.get(11)%></td>
			<td><input type= "submit" value="Book"></td>
			</tr></tbody>
	<%	}
	}
%>
</table>
</form>
</body>
</html>