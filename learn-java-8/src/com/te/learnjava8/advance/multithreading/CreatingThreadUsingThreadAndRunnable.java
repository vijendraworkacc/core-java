package com.te.learnjava8.advance.multithreading;

class MyThread extends Thread {

	public void task() {
		for (int i = 'a'; i <= 'z'; i++) {
			System.out.println("char: " + (char) i);
		}
	}

	@Override
	public void run() {
		task();
	}

	public MyThread(String name) {
		super(name);
	}

}

class MyRunnableThread implements Runnable {

	public void task() {
		for (int i = 1; i < 27; i++) {
			System.out.println("int: " + i);
		}
	}

	@Override
	public void run() {
		task();
	}

};

public class CreatingThreadUsingThreadAndRunnable {
	public static void main(String[] args) {
		System.out.println("main() start!");

		// Two ways of creating a thread!
		Thread myThread = new MyThread("my-thread"); // 1st -> Using Thread class
		// Thread myRunnableThread = new Thread(new MyRunnableThread(),
		// "my-runnable-thread");
		// 2nd -> Using Runnable interface

		Runnable runnable = () -> {
			for (int i = 1; i < 27; i++) {
				System.out.println("int: " + i);
			}
		};
		Thread myLambdaTHread = new Thread(runnable);

		myThread.start();
		// myRunnableThread.start();
		myLambdaTHread.start();

		System.out.println("main() end!");
	}
}
