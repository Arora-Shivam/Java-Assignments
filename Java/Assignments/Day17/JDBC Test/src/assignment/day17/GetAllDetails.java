package assignment.day17;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class GetAllDetails {

	public static void main(String[] args) {
		
		
		//Setting the jar file
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//Prepare url
		String url="jdbc:mysql://localhost:3306/db1";
		
		//Set the connection
		PreparedStatement ps=null;
		try (Connection con=DriverManager.getConnection(url, "root", "shivam")){
		
			String query="select * from employee";
			ps=con.prepareStatement(query);
			
			ResultSet rs=ps.executeQuery();
			
			while(rs.next()) {
				
				
				String name=rs.getString("name");
				String address=rs.getString("address");
				int salary=rs.getInt("salary");
				int id=rs.getInt("eid");
				
				
				System.out.println("Employee Details=>");
				System.out.println("Employee Id- "+id);
				System.out.println("Name- "+name);
				System.out.println("Address- "+address);
				System.out.println("Salary- "+salary);
				
				System.out.println("===============================");
				System.out.println();
			}
			
			
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}

