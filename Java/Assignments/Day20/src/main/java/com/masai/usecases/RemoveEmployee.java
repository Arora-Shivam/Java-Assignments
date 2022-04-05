package com.masai.usecases;

import com.masai.app.dao.EmployeeDao;
import com.masai.app.dao.EmployeeDaoImpl;

public class RemoveEmployee {

	public static void main(String[] args) {
		
		EmployeeDao emp=new EmployeeDaoImpl();
		
		boolean res=emp.deleteEmployee(1003);
		System.out.println(res);
	}

}
