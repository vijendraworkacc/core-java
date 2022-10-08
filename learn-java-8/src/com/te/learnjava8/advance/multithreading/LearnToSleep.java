package com.te.learnjava8.advance.multithreading;

public class LearnToSleep {
	public static void letsSleep(int time) throws InterruptedException {
		Thread.sleep(time);
	}

	public static void main(String[] args) {
		System.out.println("main(...) starts!");
		try {
			letsSleep(5000);
		} catch (InterruptedException e) {
			System.out.println(e.getMessage());
		}
		System.out.println("main(...) ends!");
	}
}
