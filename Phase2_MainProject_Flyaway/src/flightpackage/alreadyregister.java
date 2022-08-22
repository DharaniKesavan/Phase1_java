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

@WebServlet("/alreadyregister")
public class alreadyregister extends HttpServlet {
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
		    
		    String username = (String) request.getSession().getAttribute("username");
		    String query = "select * from register_details where Email_id = '"+username+"'";	    
		    rs = stmt.executeQuery(query); 
		    if(rs.next()){
		    	String fullname = rs.getString("Full_Name");
		    	request.getSession().setAttribute("fullname",fullname);
		    	String age = rs.getString("Age");
		    	request.getSession().setAttribute("age",age);
		    	String mobile = rs.getString("Mobile");
		    	request.getSession().setAttribute("mobile",mobile);
		    	String email = rs.getString("Email_id");
		    	request.getSession().setAttribute("email",email);	    	
		    }
		    else{
		    	response.sendRedirect("firstregister.jsp?error=1"); 
		    }
		    response.sendRedirect("review.jsp"); 
		    if(rs!=null){
				rs.close();
			}
			stmt.close();
			con.close();				
		}
		catch(Exception e){
			out.println(e.getMessage());
		}
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}
}
