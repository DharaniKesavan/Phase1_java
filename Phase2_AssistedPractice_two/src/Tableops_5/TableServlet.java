package Tableops_5;

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

public class TableServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	static String url = "jdbc:mysql://localhost:3306/product";
    static String user = "root";
    static String password = "root";
    private static Connection conn;

    public TableServlet() {
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
            
 				Statement stmt = conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
                stmt.executeUpdate("insert into eproduct (Id, name, price) values (7, 'New Product',5000)");
                out.println("Executed an insert operation<br>");
                
                stmt.executeUpdate("update eproduct set price = 2000 where name = 'New Product'");
                out.println("Executed an update operation<br>");
                
                stmt.executeUpdate("delete from eproduct where name = 'New Product'");
                out.println("Executed a delete operation<br>");
                
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
