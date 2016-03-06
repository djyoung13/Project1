import java.io.DataInputStream;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class EchoServlet
 */
@WebServlet(name = "MyOwnServlet",
description = "This is my first annotated servlet",
urlPatterns = {"/DatabaseAccessServlet","/DBA"})
public class DatabaseAccess extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
	private String message;
	
    public DatabaseAccess() {
        super();
        // TODO Auto-generated constructor stub
    }

    public void init() throws ServletException
    {
    	//System.out.println("in init");
        // Do required initialization
        message = "Hotel Reservation System";
    }
    
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//System.out.println("calling doGet");
		String command = null;
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
			out.println("<!DOCTYPE html>");
			out.println("<html>");
			out.println("<body>");
	    	out.println("<h1><center>" + message + "</center></h1>");
	    	out.println("<p> Please enter a command: </p>");
	    	out.println("<ul>");
	    	out.println("<li>CREATE CUSTOMER</li>");
	    	out.println("<li>RESERVE ROOM</li>");
	    	out.println("<li>CREATE PAYMENT</li>");
	    	out.println("<li>GET CUSTOMER __*</li>");
	    	out.println("<li>GET CUSTOMERS BYNAME __**</li>");
	    	out.println("<li>GET CUSTOMERS CURRENT</li>");
	    	out.println("<li>GET TRANSACTIONS __*</li>");
	    	out.println("<li>GET VACANCIES</li>");
	    	out.println("<li>GET RESERVATIONS</li>");
	    	out.println("</ul>");
	    	out.println("<p>* = enter CUSTOMER_ID | ** = enter CUSTOMER_NAME </p>");
	    	
	    	out.println("<form method='GET' action='htmlform/DatabaseAccessServlet'>"); 
	    	out.println("<p>Command <input type='text' name='command'</p>");
	    	out.println("<p><input type='submit' value='Submit' name='B1'></p>");
	    	out.println("</form>");
	    	/*
	    	out.println("<form>");
	    	out.println("COMMAND:");
	    	out.println("<input type ='text' name='command'><br>");
	    	out.println("</form>");
	    	*/
	    	
	    	if (command.equalsIgnoreCase("CREATE CUSTOMER"))
	    	{
	    		
	    	}
	    	
	    	if (command.equalsIgnoreCase("RESERVE ROOM"))
	    	{
	    		
	    	}
	    	if (command.equalsIgnoreCase("CREATE PAYMENT"))
	    	{
	    		
	    	}
	    	if (command.equalsIgnoreCase("GET VACANCIES"));
	    	{
	    		
	    	}
	    	if (command.equalsIgnoreCase("GET RESERVATIONS"))
	    	{
	    		
	    	}
	    	if (command.equalsIgnoreCase("GET TRANSACTIONS"))
	    	{
	    		
	    	}
	    	else if (command.contains("GET CUSTOMERS CURRENT"))
	    	{
	    		
	    	}
	    	else if (command.contains("GET CUSTOMER "))
	    	{
	    		
	    	}
	    	else if (command.contains("GET CUSTOMERS BYNAME"))
	    	{
	    		
	    	}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String v = request.getParameter("id");
		System.out.println(v);
	
		
	}

}