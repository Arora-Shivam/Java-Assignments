package com.masai.app.beans;

public class Employee {
	private int empId;
	private String name;
	private String address;
	private int salary;
	
	
	@Override
	public String toString() {
		return "Employee [eid=" + empId + ", name=" + name + ", address=" + address + ", salary=" + salary + "]";
	}
	
	
	public Employee(int eid, String name, String address, int salary) {
		super();
		this.empId = eid;
		this.name = name;
		this.address = address;
		this.salary = salary;
	}
	
	public Employee() {
		super();
	}
	
	
	public int getEid() {
		return empId;
	}
	
	public void setEid(int eid) {
		this.empId = eid;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	public int getSalary() {
		return salary;
	}
	
	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	
	
	
	
}
