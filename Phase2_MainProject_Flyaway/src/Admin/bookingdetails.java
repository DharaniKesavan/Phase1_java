package Admin;

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

@WebServlet("/bookingdetails")
public class bookingdetails extends HttpServlet {
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
		    String mail = (String)request.getSession().getAttribute("email");
		    String flight = (String)request.getSession().getAttribute("flight");
		    int bookseat =  (int) request.getSession().getAttribute("bookseat");
		    int availseat = (int) request.getSession().getAttribute("availseat");
		    String query1 = "insert into booking_details(Email_id,Flight_No) values('"+mail+"','"+flight+"')";
		    int j = stmt.executeUpdate(query1); 
		    if(j>0){
		    	System.out.println("Booking details inserted successfully!!!<br><br>");
		    }
		    String query2 = "UPDATE flight_details SET Booked_seats = '"+bookseat+"', Availabe_seats ='"+availseat+"' WHERE Flight_No = '"+flight+"'";
		    int i = stmt.executeUpdate(query2); 
		    if(i>0){
		    	System.out.println("Flight details updated successfully!!!<br><br>");
		    }
		    response.sendRedirect("finalpage.jsp"); 
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
