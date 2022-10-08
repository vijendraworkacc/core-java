package com.te.learnjava8.advance.collections.list;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class LearnLinkedList {
	public static void main(String[] args) {
		LinkedList<Integer> linkedList = new LinkedList<Integer>();
		linkedList.add(1);
		linkedList.add(2);
		linkedList.add(20);
		linkedList.add(25);

		// Printing
		System.out.println(linkedList);

		// For loop on linkedList
		for (int i = 0; i < linkedList.size(); i++) {
			System.out.print(linkedList.get(i) + " ");
		}

		// Advance for loop (foreach loop) on linkedList
		for (Integer integer : linkedList) {
			System.out.print(integer + " ");
		}
		System.out.println();

		// Iterator and cursor
		Iterator<Integer> iterator = linkedList.iterator();
		while (iterator.hasNext()) {
			System.out.print(iterator.next() + " ");
		}
		System.out.println();

		// ListIterator and cursor
		ListIterator<Integer> listIterator = linkedList.listIterator();
		while (listIterator.hasNext()) {
			System.out.print(listIterator.next() + " ");
		}
		System.out.print(" -> ");
		while (listIterator.hasPrevious()) {
			System.out.print(listIterator.previous() + " ");
		}
		System.out.println();

		// Stream api
		linkedList.stream().forEach(o -> System.out.println(o + " "));
		
		// Removing element
		System.out.println("----------");
		System.out.println(linkedList);
		linkedList.remove(2);
		System.out.println(linkedList);
		
	}
}
