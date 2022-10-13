package com.te.learnjava8.advance.java8features.streamapi;

import java.time.LocalDate;

public class Employee {
	private String empId;
	private String empName;
	private int empAge;
	private LocalDate empDataOfJoining;
	private double empSalary;

	public Employee() {
		super();
	}

	public Employee(String empId, String empName, int empAge, LocalDate empDataOfJoining, double empSalary) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.empAge = empAge;
		this.empDataOfJoining = empDataOfJoining;
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

	public int getEmpAge() {
		return empAge;
	}

	public void setEmpAge(int empAge) {
		this.empAge = empAge;
	}

	public LocalDate getEmpDataOfJoining() {
		return empDataOfJoining;
	}

	public void setEmpDataOfJoining(LocalDate empDataOfJoining) {
		this.empDataOfJoining = empDataOfJoining;
	}

	public double getEmpSalary() {
		return empSalary;
	}

	public void setEmpSalary(double empSalary) {
		this.empSalary = empSalary;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + empAge;
		result = prime * result + ((empDataOfJoining == null) ? 0 : empDataOfJoining.hashCode());
		result = prime * result + ((empId == null) ? 0 : empId.hashCode());
		result = prime * result + ((empName == null) ? 0 : empName.hashCode());
		long temp;
		temp = Double.doubleToLongBits(empSalary);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		if (empAge != other.empAge)
			return false;
		if (empDataOfJoining == null) {
			if (other.empDataOfJoining != null)
				return false;
		} else if (!empDataOfJoining.equals(other.empDataOfJoining))
			return false;
		if (empId == null) {
			if (other.empId != null)
				return false;
		} else if (!empId.equals(other.empId))
			return false;
		if (empName == null) {
			if (other.empName != null)
				return false;
		} else if (!empName.equals(other.empName))
			return false;
		if (Double.doubleToLongBits(empSalary) != Double.doubleToLongBits(other.empSalary))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", empAge=" + empAge + ", empDataOfJoining="
				+ empDataOfJoining + ", empSalary=" + empSalary + "]";
	}

}
