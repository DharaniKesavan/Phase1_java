<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ include file = "header.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Search page</title>
</head>
<body style="text-align:center">
<h2>Enter the Flight details:</h2>
<form action="<%= request.getContextPath() %>/Flightdetails">
Date of travel:
  <select name="dateOfTravel">
    <option value="2022-08-01">2022-08-01</option>
    <option value="2022-08-02">2022-08-02</option>
    <option value="2022-08-03">2022-08-03</option>
    <option value="2022-08-04">2022-08-04</option>
    <option value="2022-08-05">2022-08-05</option>
    <option value="2022-08-06">2022-08-06</option>    
  </select>
  <br><br>
Source city:
<select name="txt_source">
    <option value="Mumbai">Mumbai</option>
    <option value="Banglore">Banglore</option>
    <option value="Chennai">Chennai</option>
    <option value="Coimbatore">Coimbatore</option>
    <option value="Hyderabad">Hyderabad</option>   
  </select>
  <br><br>
Destination city:
<select name="txt_dest">
    <option value="New Delhi">New Delhi</option>
    <option value="Pune">Pune</option>
    <option value="Mumbai">Mumbai</option>
    <option value="Chennai">Chennai</option>
    <option value="Kochi">Kochi</option>
  </select>
  <br><br>
Number of Persons:
<input type="text" name="txt_persons" required/><br><br>
<input type="submit" value="Search"/><br><br>
</form>
</body>
</html>