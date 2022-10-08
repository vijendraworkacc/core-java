package com.te.learnjava8.advance.java8features.functional;

import java.util.Arrays;
import java.util.Comparator;

class SortStudentsOnAge implements Comparator<Student> {

	@Override
	public int compare(Student student1, Student student2) {
		return student1.getsAge() - student2.getsAge();
	}

}

class SortStudentsOnName implements Comparator<Student> {
	
	@Override
	public int compare(Student student1, Student student2) {
		return student1.getsName().hashCode() - student2.getsName().hashCode();
	}

}

public class LearnFunctionalInterface {
	public static void main(String[] args) {
		Student[] students = { new Student(10, "S", 21), new Student(2, "W", 26), new Student(45, "A", 25),
				new Student(19, "Z", 20), new Student(1, "K", 22), };

		// Lambda expression!
		Comparator<Student> comparatorOnAge = (student1, student2) -> student2.getsAge() - student1.getsAge();

		// Lambda expression!
		Comparator<Student> comparatorOnName = (student1, student2) -> student1.getsName().hashCode()
				- student2.getsName().hashCode();

		Arrays.sort(students, comparatorOnAge);

		for (Student student : students) {
			System.out.println(student);
		}
	}
}
