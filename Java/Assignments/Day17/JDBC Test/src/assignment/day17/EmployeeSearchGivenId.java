package assignment.day17;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class EmployeeSearchGivenId {
public static void main(String[] args) {
		
		//User input
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the Employee Id whose Details you want to know->");
		int eid=input.nextInt();
		input.close();
		
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
		
			String query="select * from employee where eid=?";
			ps=con.prepareStatement(query);
			ps.setInt(1, eid);
			
			ResultSet rs=ps.executeQuery();
			
			if(rs.next()) {
				
			
				String name=rs.getString("name");
				String address=rs.getString("address");
				int salary=rs.getInt("salary");
				
				System.out.println("Employee Details=>");
				System.out.println("Name- "+name);
				System.out.println("Address- "+address);
				System.out.println("Salary- "+salary);
				
				
			}
			else {
				System.out.println("Wrong eid");
			}
			
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
