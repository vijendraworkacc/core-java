package com.te.learnjava8.basic;

public class SomeLogics {
	private static int[] giveArray() {
		return new int[] { 1, 2, 3, 4, 5 };
	}

	public static void main(String[] args) {
		for (int i : giveArray()) {
			System.out.println(i);
		}
	}
}