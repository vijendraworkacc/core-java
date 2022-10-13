package com.te.learnjava8.designpattern.builder;

import java.time.LocalDate;

public class Employee {
	private String empId;
	private String empName;
	private LocalDate empDOJ;
	private int empAge;
	private LocalDate empDOB;
	private double empSalary;

	public Employee() {
		super();
	}

	public Employee(String empId, String empName, LocalDate empDOJ, int empAge, LocalDate empDOB, double empSalary) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.empDOJ = empDOJ;
		this.empAge = empAge;
		this.empDOB = empDOB;
		this.empSalary = empSalary;
	}

	public String getEmpId() {
		return empId;
	}

	public void setEmpId(String empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public LocalDate getEmpDOJ() {
		return empDOJ;
	}

	public void setEmpDOJ(LocalDate empDOJ) {
		this.empDOJ = empDOJ;
	}

	public int getEmpAge() {
		return empAge;
	}

	public void setEmpAge(int empAge) {
		this.empAge = empAge;
	}

	public LocalDate getEmpDOB() {
		return empDOB;
	}

	public void setEmpDOB(LocalDate empDOB) {
		this.empDOB = empDOB;
	}

	public double getEmpSalary() {
		return empSalary;
	}

	public void setEmpSalary(double empSalary) {
		this.empSalary = empSalary;
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", empDOJ=" + empDOJ + ", empAge=" + empAge
				+ ", empDOB=" + empDOB + ", empSalary=" + empSalary + "]";
	}

}
