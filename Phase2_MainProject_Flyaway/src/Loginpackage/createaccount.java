package Loginpackage;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.LinkedList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/createaccount")
public class createaccount extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private static final String url = "jdbc:mysql://localhost:3306/product";
    private static final String user = "root";
    private static final String password = "root";
    private static Connection con;
    private static ResultSet rs;
    private static Statement stmt;
 
    public createaccount() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();	
		String un = request.getParameter("username");	
		String p1 = request.getParameter("password1");
		String p2 = request.getParameter("password2");
	try{
		if(p2.equals(p1) && p1.length()==12 && p2.length()==12 ){
			//checking the password
			try {
				Class.forName("com.mysql.jdbc.Driver");
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			}
			System.out.println("Connecting to database...");
			con = DriverManager.getConnection(url, user, password);
			stmt = con.createStatement();	
			
			LinkedList <String> list = new LinkedList <String>();
			String query = "select Username from user_login";
			
			rs = stmt.executeQuery(query); 
			while(rs.next()){
				System.out.println(rs.getString("Username"));
				list.add(rs.getString("Username"));
			}
			if(list.contains(un)){
				request.getSession().setAttribute("error1","1");
				response.sendRedirect("newaccount.jsp");
			}
			else{
				int i =stmt.executeUpdate("insert into user_login(Username,Password) values('"+un+"','"+p1+"')"); 
				if(i>0){
					out.println("Account created successfully!!!<br><br>");
					out.println("<a href='user.jsp'>Go to Login page</a>");
				}
			}
			if(rs!=null){
				rs.close();
			}
			stmt.close();
			con.close();
			//response.sendRedirect("user.jsp"); 
		}
		else{
			request.getSession().setAttribute("error2","2");
			response.sendRedirect("newaccount.jsp");
		}
	}
	catch(Exception ex){
		out.println(ex.getMessage());
		out.println("Can't able to insert login details into the database...");
	}		
	
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}
}
