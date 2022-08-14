package Connection_statement_2;

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

public class StatementServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	static String url = "jdbc:mysql://localhost:3306/product";
    static String user = "root";
    static String password = "root";
    private static Connection conn;
    
    public StatementServlet() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
            PrintWriter out = response.getWriter();
            out.println("<html><body>");
              
            try {
      			 Class.forName("com.mysql.jdbc.Driver");
      		 } 
      		 catch (ClassNotFoundException e) {
      			 e.printStackTrace();
      		 }
      		 System.out.println("Connecting to database...");
      		 try {
      			 conn = DriverManager.getConnection(url, user, password);
      			 if(conn!=null) {
      	           Statement stmt = conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
      	           stmt.executeUpdate("insert into eproduct (Id, name, price) values (4, 'Dell', 18000)");
      	           ResultSet rst = stmt.executeQuery("select * from eproduct");
      	           
      	           while (rst.next()) {
      	                   out.println(rst.getInt("ID") + ", " + rst.getString("name") + "<Br>");
      	           } 	           
      	           stmt.close();          
      	           out.println("</body></html>");
      	           
  	      		 }
      		 } 
      		 catch (SQLException e1) {
      			 e1.printStackTrace();
      		 }  		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	}
}
