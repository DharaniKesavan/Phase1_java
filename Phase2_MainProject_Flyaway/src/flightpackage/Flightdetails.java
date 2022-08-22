package flightpackage;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Flightdetails")
public class Flightdetails extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private static final String url = "jdbc:mysql://localhost:3306/product";
    private static final String user = "root";
    private static final String password = "root";
    private static Connection con;
    private static ResultSet rs;
    private static Statement stmt;
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
			String date = request.getParameter("dateOfTravel");
			String source = request.getParameter("txt_source");
			String dest = request.getParameter("txt_dest");
			int person = Integer.valueOf(request.getParameter("txt_persons"));
			
		    try {
				Class.forName("com.mysql.jdbc.Driver");
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			}
		    System.out.println("Connecting to database...");
		    con = DriverManager.getConnection(url, user, password);
		    stmt = con.createStatement();	
			String query = "select * from flight_details where Date_of_travel='"+date+"' and Source_City='"+source+"' and Destination_City='"+dest+"'";
			ArrayList<ArrayList<String>> arrRow = new ArrayList<ArrayList<String>>();
			ArrayList<String> arrCol = new ArrayList<String>();
			rs = stmt.executeQuery(query); 
			while(rs.next()){
				arrCol = new ArrayList<String>();
				arrCol.add(rs.getString("Flight_No"));//0
				arrCol.add(rs.getString("Airline_Name"));//1
				arrCol.add(rs.getString("Source_City"));//2
				arrCol.add(rs.getString("Destination_City"));//3
				arrCol.add(rs.getString("Date_of_travel"));//4
				arrCol.add(rs.getString("Dept_time"));//5
				arrCol.add(rs.getString("Arrival_time"));//6
				arrCol.add(rs.getString("Class")); //7
				arrCol.add(rs.getString("Price"));//8
				arrCol.add(rs.getString("Total_seats"));//9
				arrCol.add(rs.getString("Booked_seats"));//10
				arrCol.add(rs.getString("Availabe_seats"));//11
				arrRow.add(arrCol);
			}
			
			request.getSession().setAttribute("arrRow",arrRow);
			request.getSession().setAttribute("date",date);
			request.getSession().setAttribute("source",source);
			request.getSession().setAttribute("dest",dest);
			request.getSession().setAttribute("person",person);
			response.sendRedirect("flightdetails.jsp"); 
			if(rs!=null){
				rs.close();
			}
			stmt.close();
			con.close();
		}
		catch(Exception e){
			e.printStackTrace();
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}
}
