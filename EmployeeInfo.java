package com.hibernate.model;

public class EmployeeInfo {
	private String empId;
	private String empName;
	private double empSalary;
	
	public EmployeeInfo() {
		
		
	}
	
	public EmployeeInfo(String empId, String empName, double empSalary) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.empSalary = empSalary;
	}
	
	public String getEmpId() {
		return empId;
	}
	
	public void setEmpId(String empid) {
		this.empId = empId;
	}
	
	public String getEmpName() {
		return empName;
	}
	
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	
	public double getEmpSalary() {
		return empSalary;
	}
	
	public void setEmpSalary(double empSalary) {
		this.empSalary = empSalary;
	}

}
