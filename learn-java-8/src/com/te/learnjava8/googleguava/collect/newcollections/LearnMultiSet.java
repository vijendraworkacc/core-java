package com.te.learnjava8.googleguava.collect.newcollections;

import com.google.common.collect.HashMultiset;
import com.google.common.collect.Multiset;

public class LearnMultiSet {
	public static void main(String[] args) {
		Multiset<String> multiset = HashMultiset.<String>create();
		multiset.add("A");
		multiset.add("A");
		multiset.add("B");
		multiset.add("B");
		multiset.add("B");
		multiset.add("C");
		multiset.add("C");
		
		System.out.println(multiset);
		System.out.println(multiset.count("B"));
	}
}
