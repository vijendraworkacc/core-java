package com.te.learnjava8.advance.collections.map;

public class StudentId implements Comparable<StudentId> {
	private String universityCode;
	private int rollNum;
	private char section;

	public StudentId() {
		super();
	}

	public StudentId(String universityCode, int rollNum, char section) {
		super();
		this.universityCode = universityCode;
		this.rollNum = rollNum;
		this.section = section;
	}

	public String getUniversityCode() {
		return universityCode;
	}

	public void setUniversityCode(String universityCode) {
		this.universityCode = universityCode;
	}

	public int getRollNum() {
		return rollNum;
	}

	public void setRollNum(int rollNum) {
		this.rollNum = rollNum;
	}

	public char getSection() {
		return section;
	}

	public void setSection(char section) {
		this.section = section;
	}

	@Override
	public int hashCode() {
		System.out.println("StudentId hashCode()!");
		final int prime = 31;
		int result = 1;
		result = prime * result + rollNum;
		result = prime * result + section;
		result = prime * result + ((universityCode == null) ? 0 : universityCode.hashCode());
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
		StudentId other = (StudentId) obj;
		if (rollNum != other.rollNum)
			return false;
		if (section != other.section)
			return false;
		if (universityCode == null) {
			if (other.universityCode != null)
				return false;
		} else if (!universityCode.equals(other.universityCode))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "StudentId [universityCode=" + universityCode + ", rollNum=" + rollNum + ", section=" + section + "]";
	}

	@Override
	public int compareTo(StudentId o) {
		return this.getRollNum() - o.getRollNum();
	}

}
