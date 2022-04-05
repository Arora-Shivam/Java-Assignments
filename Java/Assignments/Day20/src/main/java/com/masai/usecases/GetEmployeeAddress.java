package com.masai.usecases;

import com.masai.app.dao.EmployeeDao;
import com.masai.app.dao.EmployeeDaoImpl;

public class GetEmployeeAddress {

	public static void main(String[] args) {
		EmployeeDao emp=new EmployeeDaoImpl();
		String name=emp.getAddressOfEmployee(1001);
		System.out.println(name);

	}

}
