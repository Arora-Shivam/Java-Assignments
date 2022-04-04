package assignment.day17;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class EmployeeSalaryLessThanAmountGiven {

	public static void main(String[] args){
		
		//Register Driver
				try {
					Class.forName("com.mysql.cj.jdbc.Driver");
				} catch (ClassNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				//Setting Url
				String url="jdbc:mysql://localhost:3306/db1";
				
				//Connection
				try (Connection con=DriverManager.getConnection(url,"root","shivam")){
					
					boolean flag =true;
					
					String query="select * from employee where salary<80000";
					PreparedStatement ps=con.prepareStatement(query);
					
					ResultSet rs=ps.executeQuery();
					
					while(rs.next()) {
						flag=false;
						System.out.println("Employee Details=>");
						
						System.out.println("Id-> "+rs.getInt("eid"));
						System.out.println("Name-> "+rs.getString("Name"));
						System.out.println("Address-> "+rs.getString("Address"));
						System.out.println("Salary-> "+rs.getInt("Salary"));
						
						System.out.println("===========================");
						System.out.println();
					}
					if(flag) {
						System.out.println("No Employees Found");
					}
					
					
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
	}

}
