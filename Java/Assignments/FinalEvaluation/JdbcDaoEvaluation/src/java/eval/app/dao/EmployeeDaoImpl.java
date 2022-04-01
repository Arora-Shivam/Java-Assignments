package java.eval.app.dao;

import java.eval.app.beans.Employee;

import java.eval.app.utility.DbUtil;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public class EmployeeDaoImpl implements EmployeeDao{

	@Override
	public String saveEmployeeDetails(Employee employee) {
		
		String msg="";
		
		
		try(Connection con=DbUtil.provideConnection()) {
			System.out.println(con);
			String query="insert into employee values(?,?,?,?)";
			PreparedStatement ps=con.prepareStatement(query);
			ps.setInt(1, employee.getEmpId());
			ps.setString(2, employee.getName());
			ps.setString(3, employee.getAddress());
			ps.setInt(4, employee.getSalary());
			
			int x=ps.executeUpdate();
			
			if(x==1) {
				msg="saved";
			}
			else {
				msg="Not saved";
			}
			
			
		} catch (SQLException e) {
			msg="Error";
			e.printStackTrace();
		}
		
		return msg;
	}

	@Override
	public Employee getEmployeeById(int empId) {
		Employee emp=null;
		
		try(Connection con=DbUtil.provideConnection()) {
			System.out.println(con);
			String query="select * from employee where empId=?";
			PreparedStatement ps=con.prepareStatement(query);
			
			
			ResultSet rs=ps.executeQuery();
			
			if(rs.next()) {
				emp=new Employee(rs.getInt("empId"), rs.getInt("Salary"), rs.getString("Name"), rs.getString("Address"));
			}
		}
		catch (SQLException e) {
		
			e.printStackTrace();
		}
		return emp;
	}

	@Override
	public List<Employee> getAllEmployees() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String deleteEmployee(int empId) {
		// TODO Auto-generated method stub
		return null;
	}

}
