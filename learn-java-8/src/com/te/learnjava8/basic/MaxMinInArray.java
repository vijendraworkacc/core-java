package com.te.learnjava8.basic;

public class MaxMinInArray {
	private static class MaxMinHold {
		int max = 0;
		int min = 0;
	}

	public static MaxMinHold findMaxMin(int[] arr) {
		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;

//		for (int i = 0; i < arr.length; i++) {
//			if (arr[i] > max)
//				max = arr[i];
//			if (arr[i] < min)
//				min = arr[i];
//		}

		for (int i : arr) {
			if (i > max)
				max = i;
			if (i < min)
				min = i;
		}
		MaxMinHold hold = new MaxMinHold();
		hold.max = max;
		hold.min = min;
		return hold;
	}

	public static void main(String[] args) {
		int[] arr = { 2, 12, -2, 11, 9, 23 };
		MaxMinHold hold = findMaxMin(arr);
		System.out.println(hold.max);
		System.out.println(hold.min);
	}
}
