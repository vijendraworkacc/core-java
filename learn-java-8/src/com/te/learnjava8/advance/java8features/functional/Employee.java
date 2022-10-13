package com.te.learnjava8.advance.java8features.functional;

import java.io.Serializable;

public class Employee implements Serializable, Comparable<Employee> {
	private int eId;
	private String eName;
	private int eAge;

	public Employee() {
		super();
	}

	public Employee(int eId, String eName, int eAge) {
		super();
		this.eId = eId;
		this.eName = eName;
		this.eAge = eAge;
	}

	public int geteId() {
		return eId;
	}

	public void seteId(int eId) {
		this.eId = eId;
	}

	public String geteName() {
		return eName;
	}

	public void seteName(String eName) {
		this.eName = eName;
	}

	public int geteAge() {
		return eAge;
	}

	public void seteAge(int eAge) {
		this.eAge = eAge;
	}

	@Override
	public String toString() {
		return "Employee [eId=" + eId + ", eName=" + eName + ", eAge=" + eAge + "]";
	}

	@Override
	public int hashCode() {
		System.out.println("hashCode() called!");
		final int prime = 31;
		int result = 1;
		result = prime * result + eAge;
		result = prime * result + eId;
		result = prime * result + ((eName == null) ? 0 : eName.hashCode());
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
		if (eAge != other.eAge)
			return false;
		if (eId != other.eId)
			return false;
		if (eName == null) {
			if (other.eName != null)
				return false;
		} else if (!eName.equals(other.eName))
			return false;
		return true;
	}

	@Override
	public int compareTo(Employee o) {
		// Natural order!
		return this.eAge - o.geteAge();
	}

}
