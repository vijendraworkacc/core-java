package com.te.learnjava8.basic.object;

public class Employee {
	private String empId;
	private String empName;
	private int empAge;

	public Employee() {
		super();
	}

	public Employee(String empId, String empName, int empAge) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.empAge = empAge;
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

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", empAge=" + empAge + "]";
	}

	@Override
	public int hashCode() {
		/*
		 * hashCode() method gives a unique integer value for the current object.
		 * 
		 * The default implementation of hashCode() method will give the integer value
		 * using the address of the object. And we override the hashCode() method to be
		 * able to generate the unique integer value based on the state of the object.
		 * 
		 * So, in the below implementation the state such as empId, empAge, empName is
		 * being used to create a unique integer value.
		 */
		return this.empId.hashCode() + this.empAge + this.empName.hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		/*
		 * We are downcasting the Object class reference variable to child class because
		 * with Object class reference we cannot access the members of Employee class
		 * (child class).
		 */
		Employee employee = (Employee) obj;
		if (this.hashCode() == employee.hashCode())
			return true;
		return false;
	}

}
