<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Register page</title>
</head>
<body style="text-align:center">
<form action="<%= request.getContextPath() %>/registerdetails">
<h1>Registration Page</h1>
<h2>Fill the below details:</h2>
Fullname:
<input type="text" name="fullname" required/><br><br>
Address:
<input type="text" name="address" required/><br><br>
Age:
<input type="text" name="age" required/><br><br>
Mobile No:
<input type="text" name="mobile" pattern="[0-9]{10}" title="Enter 10 digits only" required/><br><br>
EmailID:
<input type="text" name="email" value="<%=session.getAttribute("username") %>" readonly/><br><br>
Country:
<input type="text" name="country" required/><br><br>
Proof:
<select name="proof" required>
    <option value="Aadhar No">Aadhar No</option>
    <option value="Passport">Passport</option>
    <option value="Voter ID">Voter ID</option>
    <option value="Driving license">Driving license</option>
  </select>
<br><br>
Proof No:
<input type="text" name="proofno" required/><br><br>

<input type="submit" value="Review"/><br><br>
</form>
</body>
</html>
