package com.te.learnjava8.advance.collections.list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class LearnArrayList {
	public static void main(String[] args) {
		Integer[] arr = new Integer[10];
		arr[0] = 1;
		arr[1] = 10;
		arr[2] = 20;
		arr[3] = 30;

		List<Integer> asList = Arrays.asList(arr);

		ArrayList<Integer> arrayList = new ArrayList();
		arrayList.add(1);
		arrayList.add(2);
		arrayList.add(20);
		arrayList.add(25);
		
		Object[] array = arrayList.toArray();

		// Printing
		System.out.println(arr.toString());
		System.out.println(Arrays.toString(arr));
		System.out.println(arrayList);

		// For loop on ArrayList
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		for (int i = 0; i < arrayList.size(); i++) {
			System.out.print(arrayList.get(i) + " ");
		}

		// Advance for loop (foreach loop) on ArrayList
		for (Integer integer : arr) {
			System.out.print(integer + " ");
		}
		System.out.println();
		for (Integer integer : arrayList) {
			System.out.print(integer + " ");
		}
		System.out.println();

		// Iterator and cursor
		Iterator<Integer> iterator = arrayList.iterator();
		while (iterator.hasNext()) {
			System.out.print(iterator.next() + " ");
		}
		System.out.println();

		// ListIterator and cursor
		ListIterator<Integer> listIterator = arrayList.listIterator();
		while (listIterator.hasNext()) {
			System.out.print(listIterator.next() + " ");
		}
		System.out.print(" -> ");
		while (listIterator.hasPrevious()) {
			System.out.print(listIterator.previous() + " ");
		}
		System.out.println();

		// Stream api
		Arrays.stream(arr).forEach(o -> System.out.println(o + " "));
		arrayList.stream().forEach(o -> System.out.println(o + " "));

	}
}
