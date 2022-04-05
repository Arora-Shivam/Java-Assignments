package com.masai.app.usecases;

import com.masai.app.dao.EmployeeDao;
import com.masai.app.dao.EmployeeDaoImpl;
import com.masai.app.exception.EmployeeException;

public class BonusToEmployee {
public static void main(String[] args) {
	EmployeeDao emp=new EmployeeDaoImpl();
	
	try {
		String res=emp.giveBonusToEmployee(1002, 10000);
		System.out.println(res);
	} catch (EmployeeException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	
}
}
