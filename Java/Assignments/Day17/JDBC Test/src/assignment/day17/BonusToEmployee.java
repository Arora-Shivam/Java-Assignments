package assignment.day17;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class BonusToEmployee {

	public static void main(String[] args) {
		
		String url="jdbc:mysql://localhost:3306/db1";
		
		PreparedStatement ps=null;
		try(Connection con=DriverManager.getConnection(url, "root", "shivam")) {
			
			String query="update employee set salary=Salary+500;";
			
			ps=con.prepareStatement(query);
			
			int x=ps.executeUpdate();

			if(x>0) {
				System.out.println(x+" rows updated");
				
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
