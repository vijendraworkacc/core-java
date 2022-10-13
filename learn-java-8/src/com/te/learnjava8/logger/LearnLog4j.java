package com.te.learnjava8.logger;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;

public class LearnLog4j {

	private final static Logger logger = Logger.getLogger(LearnLog4j.class);

	public static void main(String[] args) {
		BasicConfigurator.configure();
		// DI WEF
		logger.debug("some log!");
		logger.info("some log!");
		logger.warn("some log!");
		logger.error("some log!");
		logger.fatal("some log!");
	}
}
