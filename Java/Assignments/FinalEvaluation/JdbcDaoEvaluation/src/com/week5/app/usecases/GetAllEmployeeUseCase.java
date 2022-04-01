package com.week5.app.usecases;

import java.util.List;

import com.week5.app.beans.Employee;
import com.week5.app.dao.EmployeeDao;
import com.week5.app.dao.EmployeeDaoImpl;

public class GetAllEmployeeUseCase {
public static void main(String[] args) {
	EmployeeDao emp=new EmployeeDaoImpl();
	List<Employee> listRes=emp.getAllEmployees();
	
	for(Employee e:listRes) {
		System.out.println(e);
	}
}
}
