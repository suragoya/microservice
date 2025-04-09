package com.example.training.manageemployees;

public class Employee {
	private Integer empId;
	private String empName;
	private Double salary;
	
	public Employee() {		
	}
	public Employee(Integer eid, String eName, Double salary) {
		this.setEmpId(eid);
		this.setEmpName(eName);
		this.setSalary(salary);
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public Double getSalary() {
		return salary;
	}
	public void setSalary(Double salary) {
		this.salary = salary;
	}
	public Integer getEmpId() {
		return empId;
	}
	public void setEmpId(Integer empId) {
		this.empId = empId;
	}


}
