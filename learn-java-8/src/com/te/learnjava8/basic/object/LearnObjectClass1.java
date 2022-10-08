package com.te.learnjava8.basic.object;

public class LearnObjectClass1 {
	public static void main(String[] args) {
		Student student1 = new Student("S1", 22, "Name01");
		Student student2 = new Student("S1", 22, "Name02");

		// Before overriding ... After overriding
		System.out.println(student1 == student2); // false ... false
		System.out.println(student1.equals(student2)); // false ... true

		System.out.println(student1.hashCode() + " -- " + student2.hashCode() + ": "
				+ (student1.hashCode() == student2.hashCode()));
		// 942731712 -- 971848845: false ... -1968833949 -- -1968833949: true

		System.out.println("=============================");
		System.out.println(student1.hashCode());
		System.out.println(student2.hashCode());
	}
}
