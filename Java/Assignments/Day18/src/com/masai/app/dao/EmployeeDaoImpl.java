package com.masai.app.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.masai.app.beans.Employee;
import com.masai.app.exception.EmployeeException;
import com.masai.app.utility.DbUtil;

public class EmployeeDaoImpl implements EmployeeDao{

	@Override
	public Employee getEmployeeById(int empId) throws EmployeeException {
		Employee emp=null;
		
		Connection con=DbUtil.provideConnection();
		
		String query="select * from employee where empId=?";
		
		try {
			PreparedStatement ps=con.prepareStatement(query);
			ps.setInt(1, empId);
			
			ResultSet rs=ps.executeQuery();
			
			if(rs.next()) {
				emp=new Employee();
				emp.setEid(empId);
				emp.setName(rs.getString("name"));
				emp.setAddress(rs.getString("Address"));
				emp.setSalary(rs.getInt("Salary"));
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return emp;
	}

	@Override
	public List<Employee> getAllEmployee() {
		List<Employee> list=new ArrayList<>();
		
		
		
		try(Connection con=DbUtil.provideConnection()) {
			String query="select * from employee";
			PreparedStatement ps=con.prepareStatement(query);
			
			ResultSet rs=ps.executeQuery();
			
			while(rs.next()) {
				Employee emp=new Employee();
				emp.setEid(rs.getInt("empId"));
				emp.setName(rs.getString("name"));
				emp.setAddress(rs.getString("Address"));
				emp.setSalary(rs.getInt("Salary"));
				
				list.add(emp);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return list;
	}

	@Override
	public String saveEmployeeDetails(Employee employee) {
		String msg="Not Saved";
		
		
		
		try (Connection con=DbUtil.provideConnection()){
			String query="insert into employee values(?,?,?,?)";
			PreparedStatement ps=con.prepareStatement(query);
			
			ps.setInt(1, employee.getEid());
			ps.setString(2, employee.getName());
			ps.setString(3, employee.getAddress());
			ps.setInt(4, employee.getSalary());
			
			int x=ps.executeUpdate();
			
			if(x==1) {
				msg="Saved";
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return msg;
	}

	@Override
	public boolean deleteEmployeeById(int empId) throws EmployeeException {
		
		boolean flag=false;
		
		try (Connection con=DbUtil.provideConnection()){
			String query="delete from employee where empId=? ";
			PreparedStatement ps=con.prepareStatement(query);
			ps.setInt(1, empId);
			int x=ps.executeUpdate();
			if(x==1) {
				flag=true;
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			throw new EmployeeException("Employee Not Exist");
		}
		
		return flag;
	}

	@Override
	public String giveBonusToEmployee(int empId, int amount) throws EmployeeException {
		
		String msg="No Bonus";
		
		
		
		
		
		try (Connection con=DbUtil.provideConnection()){
			String query="Update Employee set salary=salary+? where empId=?";
			PreparedStatement ps=con.prepareStatement(query);
			ps.setInt(1, amount);
			ps.setInt(2, empId);
			int x=ps.executeUpdate();
			
			if(x==1) {
				msg="Bonus";
			}
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return msg;
	}

}
