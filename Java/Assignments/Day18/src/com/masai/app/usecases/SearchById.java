package com.masai.app.usecases;

import com.masai.app.beans.Employee;
import com.masai.app.dao.EmployeeDao;
import com.masai.app.dao.EmployeeDaoImpl;
import com.masai.app.exception.EmployeeException;

public class SearchById {
	public static void main(String[] args) {
		
		EmployeeDao emp=new EmployeeDaoImpl();
		try {
			Employee res=emp.getEmployeeById(1002);
			System.out.println(res);
		} catch (EmployeeException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
}
