package com.week5.app.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.week5.app.beans.Employee;
import com.week5.app.utility.DbUtil;

public class EmployeeDaoImpl implements EmployeeDao{

	@Override
	public String saveEmployeeDetails(Employee employee) {
		String msg="";
		
		
		try(Connection con=DbUtil.provideConnection()) {
		
			String query="insert into employee values(?,?,?,?)";
			PreparedStatement ps=con.prepareStatement(query);
			ps.setInt(1, employee.getEid());
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
			
			String query="select * from employee where empId=?";
			PreparedStatement ps=con.prepareStatement(query);
			ps.setInt(1, empId);
			
			ResultSet rs=ps.executeQuery();
			
			if(rs.next()) {
				emp=new Employee(rs.getInt("empId"), rs.getString("Address"), rs.getString("Name"), rs.getInt("Salary"));
			}
		}
		catch (SQLException e) {
		
			e.printStackTrace();
		}
		return emp;
	}

	@Override
	public List<Employee> getAllEmployees() {
		List<Employee> listEmp=new ArrayList<>();
		
		try(Connection con=DbUtil.provideConnection()) {
			
			String query="select * from employee";
			PreparedStatement ps=con.prepareStatement(query);
			
			
			ResultSet rs=ps.executeQuery();
			
			while(rs.next()) {
				Employee emp=new Employee(rs.getInt("empId"), rs.getString("Address"), rs.getString("Name"), rs.getInt("Salary"));
				listEmp.add(emp);
			}
		}
		catch (SQLException e) {
		
			e.printStackTrace();
		}
		return listEmp;
	}

	@Override
	public String deleteEmployee(int empId) {
		String msg="";
		
		
		try(Connection con=DbUtil.provideConnection()) {
		
			String query="delete from employee where empid =?";
			PreparedStatement ps=con.prepareStatement(query);
			ps.setInt(1, empId);
			
			
			int x=ps.executeUpdate();
			
			if(x==1) {
				msg="Deleted";
			}
			else {
				msg="Not Deleted";
			}
			
			
		} catch (SQLException e) {
			msg="Error";
			e.printStackTrace();
		}
		
		return msg;
	}

	

	

}
