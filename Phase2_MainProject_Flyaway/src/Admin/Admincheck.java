package Admin;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Admincheck")
public class Admincheck extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private static final String url = "jdbc:mysql://localhost:3306/product";
    private static final String user = "root";
    private static final String password = "root";
    private static Connection con;
    private static ResultSet rs;

    public Admincheck() {
        super();
    }

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
		    
		    String adminname = request.getParameter("adminname");
			PreparedStatement statement = con.prepareStatement("select Username,Password from admin_login where Username =? and Password=? ");
			statement.setString(1,adminname);
			statement.setString(2, request.getParameter("adminpass"));
			rs = statement.executeQuery();
			request.getSession().setAttribute("adminname",adminname);
			if (rs.next()==false) {
		    	response.sendRedirect("admin.jsp?error=1"); 
			}
			else
				response.sendRedirect("welcomeadmin.jsp"); 
			
			if(rs!=null){
				rs.close();
			}		
			statement.close();
			con.close();
		}
		catch(SQLException s){
			out.println(s.getMessage());
			out.println("Can't fetch the data from the database!");	
		}
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}
}
