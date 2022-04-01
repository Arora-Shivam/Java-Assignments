package com.week5.app.dao;
import java.util.List;

import com.week5.app.beans.Employee;

public interface EmployeeDao {
	public String saveEmployeeDetails(Employee employee);

	public Employee getEmployeeById(int empId);

	public List<Employee> getAllEmployees();

	public String deleteEmployee(int empId);

}