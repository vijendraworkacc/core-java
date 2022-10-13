package com.te.learnjava8.advance.collections.map;

import java.util.LinkedHashMap;
import java.util.Map;

public class LearnLinkedHashMap {
	public static void main(String[] args) {
		Map<StudentId, Student> map = new LinkedHashMap<StudentId, Student>();
		map.put(new StudentId("JNTU", 17, 'A'), new Student(new StudentId("JNTU", 19, 'A'), "U", 22));
		map.putIfAbsent(new StudentId("JNTU", 17, 'A'), new Student(new StudentId("JNTU", 20, 'A'), "V", 21));

		map.put(new StudentId("JNTU", 13, 'A'), new Student(new StudentId("JNTU", 13, 'A'), "N", 24));
		map.put(new StudentId("JNTU", 14, 'A'), new Student(new StudentId("JNTU", 14, 'A'), "P", 20));
		map.put(new StudentId("JNTU", 15, 'A'), new Student(new StudentId("JNTU", 15, 'A'), "M", 21));
		map.put(new StudentId("JNTU", 16, 'A'), new Student(new StudentId("JNTU", 16, 'A'), "K", 25));

		for (Map.Entry<StudentId, Student> entry : map.entrySet()) {
			System.out.println(entry.getValue());
		}

	}
}
