package com.masai.app.usecases;

import com.masai.app.beans.Employee;
import com.masai.app.dao.EmployeeDao;
import com.masai.app.dao.EmployeeDaoImpl;

public class SaveEmployee {
	
	public static void main(String[] args) {
		EmployeeDao emp=new EmployeeDaoImpl();
		
		Employee e1=new Employee(1005, "Shivam", "Rampur", 10000000);
		String res=emp.saveEmployeeDetails(e1);
		System.out.println(res);
	}
}
