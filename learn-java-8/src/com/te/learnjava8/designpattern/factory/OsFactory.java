package com.te.learnjava8.designpattern.factory;

public class OsFactory {
	public static AndroidOs getOs(String osType) {
		if (osType.equalsIgnoreCase("coloros")) {
			return new ColorOs();
		} else if (osType.equalsIgnoreCase("oxygenos")) {
			return new OxygenOs();
		} else if (osType.equalsIgnoreCase("miuios")) {
			return new MiuiOs();
		} else {
			return null;
		}
	}
}
