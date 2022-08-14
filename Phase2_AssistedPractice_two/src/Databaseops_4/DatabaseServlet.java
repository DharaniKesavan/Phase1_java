package Databaseops_4;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class DatabaseServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	static String url = "jdbc:mysql://localhost:3306/product";
    static String user = "root";
    static String password = "root";
    private static Connection conn;

    public DatabaseServlet() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
 			 Class.forName("com.mysql.jdbc.Driver");
 		 } 
 		 catch (ClassNotFoundException e) {
 			 e.printStackTrace();
 		 }
 		 System.out.println("Connecting to database...");
 		 try {
 			 conn = DriverManager.getConnection(url, user, password);
 			 if(conn!=null){
 				 PrintWriter out = response.getWriter();
 				 out.println("<html><body>");
            
 				Statement stmt = conn.createStatement();
                stmt.executeUpdate("create database mydatabase");
                out.println("Created database: mydatabase<br>");
                stmt.executeUpdate("use mydatabase");
                out.println("Selected database: mydatabase<br>");
                stmt.executeUpdate("drop database mydatabase");
                out.println("Dropped database: mydatabase<br>"); 
                stmt.close();
 				out.println("</body></html>");         
 			 }
 		 } 
 		 catch (SQLException e) {
           e.printStackTrace();
 		 }
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}
}
