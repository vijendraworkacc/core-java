package com.te.learnjava8.advance.multithreading;

public class LearnThreads {
	public static void main(String[] args) {
		Thread thread = new Thread("some-thread");
		System.out.println(thread.getId());
		System.out.println(thread.getName());
		System.out.println(thread.getPriority());
		System.out.println(thread.getState());
	}
}
