<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@page import="java.util.ArrayList"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Review page</title>
</head>
<body>
<h2>Review your details!!!</h2>
<form action="dummypayment.jsp">
Fullname : <%= session.getAttribute("fullname") %><br><br>
Age : <%= session.getAttribute("age") %><br><br>
Mobile No : <%= session.getAttribute("mobile") %><br><br>
Email ID : <%= session.getAttribute("email") %><br><br>
<% int p = (Integer)session.getAttribute("person"); %>
Number of Persons : <%= p %><br><br>

<% 	ArrayList arrRow  = (ArrayList) session.getAttribute("arrRow");
	ArrayList arrCol = new ArrayList();
	if(arrRow.size() > 0){
		for(int i = 0; i< arrRow.size(); i++){
			arrCol = (ArrayList)arrRow.get(i);
%>
Flight No : <%= arrCol.get(0)%><br><br>
Airline Name : <%= arrCol.get(1)%><br><br>
City : From - "<%= arrCol.get(2)%>" To - "<%= arrCol.get(3)%>"<br><br>
Date of Travel : <%= arrCol.get(4)%><br><br>
Time : <%= arrCol.get(5)%> - <%= arrCol.get(6)%><br><br>
Class : <%= arrCol.get(7)%><br><br>
<% 	String s1 =(String) arrCol.get(8);
	int fare = Integer.parseInt(s1);
	System.out.println("--fare--"+fare);
	long price = p * fare;  
	System.out.println("--price--"+price);
	request.getSession().setAttribute("price",price); 
%>
Ticket Fare : Rs.<%= price%><br><br>
<%	}
	}
%>
<% 
String flight = (String)arrCol.get(0);
request.getSession().setAttribute("flight",flight); 
String s2 =(String)arrCol.get(10);
int b = Integer.parseInt(s2);
int bookseat = b + p;
request.getSession().setAttribute("bookseat",bookseat);
String s3 =(String)arrCol.get(11);
int a = Integer.parseInt(s3);
int availseat = a - bookseat ;
request.getSession().setAttribute("availseat",availseat); 
%>
<input type="submit" value="Pay" />
</form>
</body>
</html>