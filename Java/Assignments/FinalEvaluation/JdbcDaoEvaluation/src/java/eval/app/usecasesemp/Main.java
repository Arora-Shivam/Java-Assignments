package java.eval.app.usecasesemp;

import java.eval.app.beans.Employee;
import java.eval.app.dao.EmployeeDao;
import java.eval.app.dao.EmployeeDaoImpl;

public class Main {
	public static void main(String[] args) {
		
		EmployeeDao emp=new EmployeeDaoImpl();
		
//		String res=emp.saveEmployeeDetails(new Employee(1001, 98000, "Shivam", "Rampur"));
//		System.out.println(res);
		
		Employee employee=emp.getEmployeeById(1001);
		
		System.out.println(employee.getName());
	}

}
