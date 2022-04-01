package com.week5.app.usecases;

import com.week5.app.beans.Employee;
import com.week5.app.dao.EmployeeDao;
import com.week5.app.dao.EmployeeDaoImpl;

public class SaveAllEmployeeDetailsUseCase {
public static void main(String[] args) {
	
	EmployeeDao emp=new EmployeeDaoImpl();
	String res2=emp.saveEmployeeDetails(new Employee(1004, "rakesh", "Moradabad", 999990));
	System.out.println(res2);
}
}
