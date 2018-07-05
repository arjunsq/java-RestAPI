import java.sql.*;


public class JDBC 
{

	public static void main(String[] args) 
	{
		
			try 
			{
				Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/SAMPLE","qburst","qburstqburst");
				System.out.println("Connection created");
				Statement stmt=con.createStatement();  
				ResultSet rs=stmt.executeQuery("select * from CAR");  
				while(rs.next())  
				System.out.println(rs.getInt(1));  
				con.close();  
			}
			catch(Exception exc) 
			{
				exc.printStackTrace();
			}

	}

}
