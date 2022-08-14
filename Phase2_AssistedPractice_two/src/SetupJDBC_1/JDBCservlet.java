package SetupJDBC_1;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class JDBCservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	static String url = "jdbc:mysql://localhost:3306/product";
    static String user = "root";
    static String password = "root";
    private static Connection conn;
    public JDBCservlet() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    	PrintWriter out = response.getWriter();
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
   			 out.println("Database Connected Successfully!!!");
   		 }
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}
}
