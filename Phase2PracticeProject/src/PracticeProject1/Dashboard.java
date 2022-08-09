package PracticeProject1;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Dashboard extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public Dashboard() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String Username = request.getParameter("UserId");
		PrintWriter out = response.getWriter();
        out.println("Welcome "+Username+" to the Dashboard Page!!! <br>");
        out.println("<a href='logout'>Logout</a><br>");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}
}
