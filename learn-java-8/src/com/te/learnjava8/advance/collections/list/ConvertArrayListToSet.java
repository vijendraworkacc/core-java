package com.te.learnjava8.advance.collections.list;

import java.util.ArrayList;
import java.util.TreeSet;

public class ConvertArrayListToSet {
	public static void main(String[] args) {
		ArrayList<Integer> arrayList = new ArrayList<Integer>();
		arrayList.add(1);
		arrayList.add(11);
		arrayList.add(10);
		arrayList.add(12);
		arrayList.add(11);

		TreeSet<Integer> treeSet = new TreeSet<Integer>(arrayList);

		System.out.println(treeSet);
	}
}
