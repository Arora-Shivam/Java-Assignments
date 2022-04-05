package com.masai.app.usecases;

import java.util.List;

import com.masai.app.beans.Employee;
import com.masai.app.dao.EmployeeDao;
import com.masai.app.dao.EmployeeDaoImpl;

public class GetAllEmployee {
public static void main(String[] args) {
	EmployeeDao employeeDao=new EmployeeDaoImpl();
	
	List<Employee> listEmployee=employeeDao.getAllEmployee();
	
	listEmployee.forEach(i->System.out.println(i));
}
}
