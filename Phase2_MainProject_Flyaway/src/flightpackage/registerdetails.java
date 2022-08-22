package flightpackage;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/registerdetails")
public class registerdetails extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private static final String url = "jdbc:mysql://localhost:3306/product";
    private static final String user = "root";
    private static final String password = "root";
    private static Connection con;
    private static ResultSet rs;
    private static Statement stmt;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		try {
		    try {
				Class.forName("com.mysql.jdbc.Driver");
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			}
		    System.out.println("Connecting to database...");
		    con = DriverManager.getConnection(url, user, password);
		    stmt = con.createStatement();	
		    
		    String fullname = request.getParameter("fullname");
		    String address = request.getParameter("address");
		    String age = request.getParameter("age");
		    String mobile = request.getParameter("mobile");
		    String email = request.getParameter("email");
		    String country = request.getParameter("country");
		    String proof = request.getParameter("proof");
		    String proofno = request.getParameter("proofno");
		    
		    String query1 = "select Email_id from register_details where Email_id = '"+email+"'";
		    rs = stmt.executeQuery(query1);
		    if(rs.next()==false){
		    	String query2 = "insert into register_details(Full_Name,Address,Age,Mobile,Email_id,Country,Proof,Proof_No) "
		    			+ "values('"+fullname+"','"+address+"','"+age+"','"+mobile+"','"+email+"','"+country+"','"+proof+"','"+proofno+"')";
		    	int i = stmt.executeUpdate(query2); 
		    	if(i>0){
		    		System.out.println("Register details inserted successfully!!!<br><br>");
		    	}
		    	request.getSession().setAttribute("fullname",fullname);
		    	request.getSession().setAttribute("age",age);
		    	request.getSession().setAttribute("mobile",mobile);
		    	request.getSession().setAttribute("email",email);
		    	response.sendRedirect("review.jsp"); 
		    	if(rs!=null){
		    		rs.close();
		    	}
		    	stmt.close();
		    	con.close();
		    }
		    else{
		    	out.println("User already Registered!<br><br>");
		    	out.println("<a href='firstregister.jsp'>Go to Registration check page</a>");		    	
		    }
		}
		catch(Exception e){
			out.println(e.getMessage());
		}
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}
}
