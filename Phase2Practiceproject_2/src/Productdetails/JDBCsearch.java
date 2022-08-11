package Productdetails;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class JDBCsearch extends HttpServlet {
	private static final long serialVersionUID = 1L;
 
    public JDBCsearch () {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		
		int ProductId=Integer.parseInt(request.getParameter("ProductId"));
		if((1<=ProductId) && (6>=ProductId)){
			
			try {
				Class.forName("com.mysql.jdbc.Driver");
				Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/product","root","root");
				PreparedStatement ps=con.prepareStatement("select * from productdetails where ProductId= ?");
				ps.setInt(1, ProductId);
				out.println("<table border=1>");
					out.println("<caption><h3>Product Details</h3></caption>");
					ResultSet rs=ps.executeQuery();		     
					ResultSetMetaData rsmd=rs.getMetaData();
					int totalcolumn=rsmd.getColumnCount();
					out.print("<tr>");
			    
					for(int i=1;i<=totalcolumn;i++)		     {
						out.print("<th>"+rsmd.getColumnName(i)+"</th>");		    	 
					}
					out.print("<tr>");
			    
					while(rs.next())			     {
						out.print("<tr><td>"+rs.getInt(1)+"</td><td>"+rs.getString(2)+"</td><td>"+rs.getString(3)+"</td><td>"+rs.getInt(4)+"</td><td>"+rs.getInt(5)+"</td></tr>");
					}
					out.print("</table>");		
			}
			catch(Exception e){
				out.print(e);
			}
		}
		else
			out.println("Error Message : Enter valid ProductID!!!");
	}
}
