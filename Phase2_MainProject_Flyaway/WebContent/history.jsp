<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@page import="java.sql.*;"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>History of person travelling</title>
</head>
<body style="text-align:center">
<h2><u>History of person travelling</u></h2><br><br>
<form>
<table border="2" align="center">
<tr>
<td><b>Booking ID</b></td>
<td><b>Email ID</b></td>
<td><b>Flight No</b></td>
</tr>
<%
try
{
Class.forName("com.mysql.jdbc.Driver");
final String url = "jdbc:mysql://localhost:3306/product";
final String user = "root";
final String password = "root";
Connection con;
ResultSet rs;
Statement stmt;

try {
	Class.forName("com.mysql.jdbc.Driver");
} catch (ClassNotFoundException e) {
	e.printStackTrace();
}
System.out.println("Connecting to database...");
con = DriverManager.getConnection(url, user, password);
String query="select * from booking_details";
stmt=con.createStatement();
rs=stmt.executeQuery(query);
while(rs.next())
{
%>
<tr>
    <td><%=rs.getInt("booking_id") %></td>
    <td><%=rs.getString("Email_id") %></td>
    <td><%=rs.getString("Flight_No") %></td>
</tr>
<%
}
%>
</table>
<%	if(rs!=null){
		rs.close();
	}		
	stmt.close();
	con.close();
}
catch(Exception e){
    e.printStackTrace();
}
%>
</form>
</body>
</html>