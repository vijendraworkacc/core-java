package com.te.learnjava8.advance.collections.map;

import java.util.HashMap;
import java.util.Map;

public class LearnHashMap {
	public static void main(String[] args) {
		Map<Integer, String> map = new HashMap();

		map.put(1, "A");
		map.put(2, "B");
		map.put(33, "C");
		map.put(4, "D");
		map.put(5, "E");
		map.put(6, "F");

		System.out.println(map);

		for (Map.Entry<Integer, String> entry : map.entrySet()) {
			System.out.println(entry.getKey() + " - " + entry.getValue());
		}
	}
}
