package practiceproject3;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Validatedetails extends HttpServlet {
  private static final long serialVersionUID = 1L;

  protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	PrintWriter out = response.getWriter();
	try{
		String name = request.getParameter("name");
		int id = Integer.valueOf(request.getParameter("id"));
		String brand = request.getParameter("brand");
		int price = Integer.valueOf(request.getParameter("price"));
		int quantity = Integer.valueOf(request.getParameter("quantity"));
		
		if ( name.equals("") || id==0 || brand.equals("") || price==0 || quantity==0){
			response.sendRedirect("addproduct.jsp?error=1");
		} 
		else{
			try{
				Configuration cfg = new Configuration();
				cfg.configure("hibernate.cfg.xml");	 
				SessionFactory factory = cfg.buildSessionFactory();	        
				Session session = factory.openSession();				
				Transaction t = session.beginTransaction();          
	        
				Product p1=new Product();  
				p1.setName(name);
				p1.setId(id); 
				p1.setBrand(brand);
				p1.setPrice(price);
				p1.setQuantity(quantity);
	         
				int i = (Integer)session.save(p1);       
				t.commit();  							
				if (i > 0)
					out.println("Product is inserted into the Database!!!");
				System.out.println("Successfully saved in the database!!!"); 	
				factory.close();  
			    session.close();   						
			} 		  
			catch (Exception e) {
				 out.println("Error Message : Product cannot be inserted into the Database!");
			 }	     
		}
	 }catch(NumberFormatException ex){ 
		 out.println("Error Message : Invalid entry!<br><br>");
		 response.sendRedirect("addproduct.jsp?error=1");
	 }	
  }
}
