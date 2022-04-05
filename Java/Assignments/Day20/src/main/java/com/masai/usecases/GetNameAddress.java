package com.masai.usecases;

import com.masai.app.dao.EmployeeDao;
import com.masai.app.dao.EmployeeDaoImpl;

public class GetNameAddress {
public static void main(String[] args) {
	EmployeeDao emp=new EmployeeDaoImpl();
	
	String[] res=emp.getNameAndAddress(1002);
	
	System.out.println("Name "+res[0]);
	System.out.println("Address "+res[1]); 
}
}
