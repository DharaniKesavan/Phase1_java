package PracticeProject1;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class LoginFilter implements Filter {

    public LoginFilter() {
        // TODO Auto-generated constructor stub
    }

	public void destroy() {
		// TODO Auto-generated method stub
	}

	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		String Username = request.getParameter("UserId");
        String Password = request.getParameter("password");
        if( (Username != null) && (Password != null) ){
        	if((Username.equals("Dharani")) && (Password.equals("Dharu2001"))){
        		chain.doFilter(request, response);
        	}
        	else{        
            	response.getWriter().write("Error message : Enter valid Username or Password!!!"); 
        	}
        }
        else {          
        	response.getWriter().write("Error message : Enter valid Username or Password!!!");
        }
	}

	public void init(FilterConfig fConfig) throws ServletException {
		// TODO Auto-generated method stub
	}
}
