package database;
import java.sql.*;

public class Project1
{
	
	public static void main(String[] args) throws Exception
	{
		createTable();
	}
	
	public static void createTable() throws Exception
	{
		try
		{
			Connection con = getConnection();
			PreparedStatement use = con.prepareStatement("USE PROJECT1");
			Statement create = con.createStatement();
			String makeTable = 
					"CREATE TABLE IF NOT EXISTS CustInfo " +
					"(custID INT NOT NULL AUTO_INCREMENT, " +
					"firstName VARCHAR(255), " +
					"lastName VARCHAR(255), " +
					"phoneNumber INT(9), " +
					"billingAddress VARCHAR(255), " +
					"bliiingState CHAR(2), " +
					"billingZIP INT(5), " +
					"checkIN VARCHAR(255), " +
					"checkOUT VARCHAR(255), " +
					"PRIMARY KEY ( custID ))";
					
//			PreparedStatement create = 
//					con.prepareStatement("CREATE TABLE IF NOT EXISTS CustInfo("
//					+ "'custID' INT(5) NOT NULL AUTO_INCREMENT,"
//					+ "'first_name' varchar(255), 'last_name' varchar(255),"
//					+ "'phone_number' int(9), 'billing_address' varchar(255),"
//					+ "'billing_state' char(2), 'billing_zip' int(5),"
//					+ "'check_in' varchar(255), 'check_out' varchar(255)");
			use.executeUpdate();
			create.executeUpdate(makeTable);
			System.out.println("Customer table created");
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
	public static Connection getConnection() throws Exception
	{
		try
		{
			System.out.println("Attempting to connect...");
			String driver = "com.mysql.jdbc.Driver";
			String url = "jdbc:mysql://localhost:3306/";
			String username = "root";
			String password = "password";
			Class.forName(driver);
			
			System.out.println("Connection successful");
			Connection conn = DriverManager.getConnection(url,username,password);
			PreparedStatement s = conn.prepareStatement("CREATE DATABASE IF NOT EXISTS Project1");
			s.executeUpdate();
			return conn;
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		return null;
			
	}	
}

