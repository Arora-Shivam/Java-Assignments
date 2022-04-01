package com.week5.app.usecases;

import com.week5.app.beans.Employee;
import com.week5.app.dao.EmployeeDao;
import com.week5.app.dao.EmployeeDaoImpl;

public class GetEmployeeByIdUseCase {
public static void main(String[] args) {
	EmployeeDao emp=new EmployeeDaoImpl();
	Employee res=emp.getEmployeeById(1001);
	
	System.out.println(res);
}
}
