package com.te.learnjava8.advance.multithreading;

class SharedResource {
	static StringBuilder story = new StringBuilder(
			"1. throws keyword is used in method declaration. 2. It informs the calling method that the called method has statement which\r\n"
					+ "	 * can be resposible for an checked exception but the called method itself is\r\n"
					+ "	 * not handling it. And the calling method must handle it or declare it. 3. The purpose of throws keyword is to force the calling to handle the\r\n"
					+ "	 * exception. 4. For unchecked exceptions, using throws will not make sense because\r\n"
					+ "	 * unchecked exceptions are by default not forced on programmer or calling\r\n"
					+ "	 * method to be handled.");
}

class Reader extends Thread {

	public synchronized void read() {
		for (int i = 0; i < SharedResource.story.length(); i++) {
			System.out.println("Read: " + SharedResource.story.charAt(i));
		}
	}

	@Override
	public void run() {
		read();
	}

	public Reader(String name) {
		super(name);
	}

}

class Writter implements Runnable {

	public synchronized void write() {
		for (int i = 0; i < SharedResource.story.length(); i++) {
			SharedResource.story.replace(i, i + 1, i + "");
		}
	}

	@Override
	public void run() {
		write();
	}

};

public class CreatingThreadUsingThreadAndRunnable2 {
	public static void main(String[] args) {
		System.out.println("main() start!");

		Thread reader = new Reader("reader");
		Thread writter = new Thread(new Writter(), "writter");

		reader.start();
		writter.start();

		System.out.println("--> " + SharedResource.story + "<--");

		System.out.println("main() end!");
	}
}
