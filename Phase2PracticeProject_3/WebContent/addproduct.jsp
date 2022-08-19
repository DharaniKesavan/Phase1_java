<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Add new product</title>
</head>
<body>
<h2>Welcome to ECommerce!!!</h2>
<h4>Fill the form to add New Product :-</h4>
<%
  if (request.getParameter("error") != null)
          out.println("<b>Your session has expired or is invalid input.</b><br><br>");
%>
<form method="get" action ="addproduct" >
	Enter Product Name : <input type="text" name="name"><br><br>
	Enter Product ID : <input type="text" name="id"><br><br>
	Enter Product Brand : <input type="text" name="brand"><br><br>
	Enter Product Price : <input type="text" name="price"><br><br>
	Enter Product Quantity : <input type="text" name="quantity"><br><br>
	<input type="submit" value="Add">
</form>
</body>
</html>