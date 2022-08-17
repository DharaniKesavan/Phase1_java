package Servletpage;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Product")
public class Product extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String name = request.getParameter("name");
		String id = request.getParameter("id");
		String brand = request.getParameter("brand");
		String price = request.getParameter("price");
		String quantity = request.getParameter("quantity");
		
		if ( name.equals("") || id.equals("") || brand.equals("") || price.equals("") || quantity.equals("")){
			response.sendRedirect("Productinput.jsp?error=1");
		} 
		else {
			request.getSession().setAttribute("name", name);
			request.getSession().setAttribute("id", id);
			request.getSession().setAttribute("brand",brand);
			request.getSession().setAttribute("price",price);
			request.getSession().setAttribute("quantity",quantity);
			response.setContentType("text/html");  
	        PrintWriter out = response.getWriter();          
			out.println("Product details are captured by Servlet!!!<br><br>");			     
		    out.println("<a href='viewdetails.jsp'>Click here to view the product details...</a><br>");
		}		
	}
}
