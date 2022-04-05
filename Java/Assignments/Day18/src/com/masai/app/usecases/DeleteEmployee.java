package com.masai.app.usecases;

import com.masai.app.dao.EmployeeDao;
import com.masai.app.dao.EmployeeDaoImpl;
import com.masai.app.exception.EmployeeException;

public class DeleteEmployee {
	public static void main(String[] args) {
		
		
		EmployeeDao emp=new EmployeeDaoImpl();
		boolean res;
		try {
			res = emp.deleteEmployeeById(1002);
			System.out.println(res);
		} catch (EmployeeException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
		
	}
}
