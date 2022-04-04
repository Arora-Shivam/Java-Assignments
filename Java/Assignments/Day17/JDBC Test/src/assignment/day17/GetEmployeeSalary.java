package assignment.day17;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class GetEmployeeSalary {

	public static void main(String[] args) {
		
		//User input
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the Employee Id whose salary you want to know->");
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
		
			String query="select salary from employee where eid=?";
			ps=con.prepareStatement(query);
			ps.setInt(1, eid);
			
			ResultSet rs=ps.executeQuery();
			
			if(rs.next()) {
				
			
				
				int salary=rs.getInt("salary");
				
				
				System.out.println("Employee Salary- "+salary);
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

