<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Product Details Page</title>
</head>
<body>
<%
  if (request.getParameter("error") != null)
          out.println("<b>Your session has expired or is invalid input.</b><br>");
%>
<form action="<%= request.getContextPath() %>/Product">
	Enter Product Name : <Input type="text" name="name" required><br><br>
	Enter Product ID : <Input type="text" name="id" required><br><br>
	Enter Product Brand : <input type="text" name="brand" required><br><br>
	Enter Product Price : <Input type="text" name="price" required><br><br>
	Enter Product Quantity : <Input type="text" name="quantity" required><br><br>
<input type="submit" value="Submit">
</form>
</body>
</html>