package com.te.learnjava8.logger;

import java.util.logging.Logger;

public class LearnJavaLogger {
	private final static Logger logger = Logger.getLogger(LearnJavaLogger.class.getName());

	public static void m1() {
		logger.info("m1() start!");
		m2();
		System.out.println("m1() code....!");
		logger.info("m1() end!");
	}

	public static void m2() {
		logger.info("m2() start!");
		System.out.println("m2() code....!");
		logger.info("m2() end!");
	}

	public static void main(String[] args) {
		logger.info("main(...) start!");
		m1();
		logger.info("main(...) end!");
	}
}
