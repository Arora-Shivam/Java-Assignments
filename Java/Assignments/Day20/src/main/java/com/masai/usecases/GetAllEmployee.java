package com.masai.usecases;

import java.util.List;

import com.masai.app.beans.Employee;
import com.masai.app.dao.EmployeeDao;
import com.masai.app.dao.EmployeeDaoImpl;

public class GetAllEmployee {

	public static void main(String[] args) {
		
		EmployeeDao emp=new EmployeeDaoImpl();
		List<Employee> listResult=emp.getAllEmployee();
		
		listResult.forEach(e->System.out.println(e));

	}

}
