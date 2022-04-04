package assignment.day17;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class InsertDetais {

	public static void main(String[] args) {
		//Taking Input from user
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the Details of Employee to insert in Data Base");
		System.out.println("Employee Id=>");
		int eid=input.nextInt();
		
		System.out.println("Employee Name=>");
		String name=input.next();
		
		System.out.println("Employee Salary=>");
		int salary=input.nextInt();
		input.close();
		
		//Setting the jar file
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		String url="jdbc:mysql://localhost:3306/db1";
		
		//Set the connection
		PreparedStatement ps=null;
		try (Connection con=DriverManager.getConnection(url, "root", "shivam")){
		
			String query="insert into employee (eid,name,salary) values(?,?,?)";
			ps=con.prepareStatement(query);
			ps.setInt(1, eid);
			ps.setString(2, name);
			ps.setInt(3, salary);
			
			
			int x=ps.executeUpdate();
			
			if(x==1) {
				System.out.println("Inserted");
			}
			else {
				System.out.println("Error");
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}

