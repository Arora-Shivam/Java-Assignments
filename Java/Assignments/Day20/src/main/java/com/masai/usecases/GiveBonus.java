package com.masai.usecases;

import com.masai.app.dao.EmployeeDao;
import com.masai.app.dao.EmployeeDaoImpl;

public class GiveBonus {

	public static void main(String[] args) {
		EmployeeDao emp=new EmployeeDaoImpl();
		String res=emp.giveBonusToEmployee(1001,50000);
		
		System.out.println(res);
	}
}
