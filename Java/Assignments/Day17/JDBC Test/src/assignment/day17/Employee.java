package assignment.day17;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Employee {

	public static void main(String[] args) {
		
		//Setting the jar file
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
		
			e.printStackTrace();
		}
		//Prepare url
		String url="jdbc:mysql://localhost:3306/db1";
		
		//Set the connection
		try (Connection con=DriverManager.getConnection(url, "root", "shivam")){
		
	
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
