<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>View Product Details</title>
</head>
<body>
<table class="table" border=2>
    <tr>
    	<td><b>Product Name</b></td>  
    	<td><%=session.getAttribute("name")%></td> 
    </tr>
    <tr>
    	<td><b>Product ID</b></td>  
    	<td><%=session.getAttribute("id")%></td> 
    </tr>
    <tr>
    	<td><b>Product Brand</b></td>  
    	<td><%=session.getAttribute("brand")%></td> 
    </tr>
    <tr>
    	<td><b>Product Price</b></td>  
    	<td><%=session.getAttribute("price")%></td> 
    </tr>
    <tr>
    	<td><b>Product Quantity</b></td>  
    	<td><%=session.getAttribute("quantity")%></td> 
    </tr>
</table>
</body>
</html>