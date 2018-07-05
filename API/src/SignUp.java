

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.sql.*;
import java.io.*;
/**
 * Servlet implementation class SignUp
 */
@WebServlet("/SignUp")
public class SignUp extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SignUp() {
        super();
        
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		try
		{
			Class.forName("com.mysql.jdbc.Driver"); 
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/SAMPLE?useSSL=false&allowPublicKeyRetrieval=true","qburst","qburstqburst");
			
			Statement stmt = con.createStatement();
	      
			String sql = "INSERT INTO USER " + "VALUES ('100', 'Zara', 'Ali')";
			stmt.executeUpdate(sql);
			con.close(); 
			response.setContentType("text/html");

	      // Writing message to the web page
			PrintWriter out = response.getWriter();
			out.println("<h1>" + "ACCOUNT CREATED" + "</h1>");
		}
		catch(Exception exc)
		{
			exc.printStackTrace();
		}
		
	   System.out.println("\n"+"Goodbye!");
	}

}
