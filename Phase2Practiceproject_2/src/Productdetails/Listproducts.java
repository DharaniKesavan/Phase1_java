package Productdetails;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Listproducts extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private static Connection conn;
	static String url = "jdbc:mysql://localhost:3306/product";
    static String user = "root";
    static String password = "root";
    
    public Listproducts () {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out= response.getWriter();
		response.setContentType("text/html");
		 
		try {
			 Class.forName("com.mysql.jdbc.Driver");
		 } 
		 catch (ClassNotFoundException e) {
			 e.printStackTrace();
		 }
		 System.out.println("Connecting to database...");
		 try {
			 conn = DriverManager.getConnection(url, user, password);
		 } 
		 catch (SQLException e1) {
			 e1.printStackTrace();
		 }
		
		 if(conn!=null) {		
			Statement stmt;
			try {
				stmt = conn.createStatement();
				ResultSet rs=stmt.executeQuery("select * from productdetails");			
				out.print("<table border=1> <thead><tr>");
				out.print("<th>ID</th><th>ProductName</th><th>ProductBrand</th><th>Price</th><th>Quantity</th>");
				out.print("<tr></thead>");
				out.print("<tbody>");
				
				while(rs.next()) {					
					out.print("<tr>");
					out.print("<td>"+rs.getInt(1)+"</td>");
					out.print("<td>"+rs.getString(2)+"</td>");
					out.print("<td>"+rs.getString(3)+"</td>");
					out.print("<td>"+rs.getInt(4)+"</td>");
					out.print("<td>"+rs.getInt(5)+"</td>");
					out.print("</tr>");
				}			
				out.print("</tbody></table>");
				
			} catch (SQLException e) {
				e.printStackTrace();
			}		
		}
		else {		
			out.print("Error While Connecting Connections");
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}
}
