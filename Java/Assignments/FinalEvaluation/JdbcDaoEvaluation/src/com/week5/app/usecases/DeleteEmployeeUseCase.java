package com.week5.app.usecases;

import com.week5.app.dao.EmployeeDao;
import com.week5.app.dao.EmployeeDaoImpl;

public class DeleteEmployeeUseCase {
public static void main(String[] args) {
	EmployeeDao emp=new EmployeeDaoImpl();
	String res3=emp.deleteEmployee(1004);
	System.out.println(res3);
}
}
