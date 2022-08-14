package Storedprocedures_3;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Procedureservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	static String url = "jdbc:mysql://localhost:3306/product";
    static String user = "root";
    static String password = "root";
    private static Connection conn;

    public Procedureservlet() {
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
            
 				 CallableStatement stmt = conn.prepareCall("{call add_product(?, ?, ?)}");
 				 stmt.setInt(1, 5);
 				 stmt.setString(2, "Lenovo");
 				 stmt.setInt(3, 15000);
 				 stmt.executeUpdate();          
 				 out.println("Stored procedure has been executed.<Br>");
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
