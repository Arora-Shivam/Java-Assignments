package java.eval.app.dao;

import java.eval.app.beans.Employee;

import java.util.List;

public interface EmployeeDao {
	public String saveEmployeeDetails(Employee employee);

	public Employee getEmployeeById(int empId) ;

	public List<Employee> getAllEmployees();

	public String deleteEmployee(int empId);
}
