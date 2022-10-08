package com.te.learnjava8.basic.abstraction;

interface AndroidOs {
	public abstract void off();
}

class ColorOs implements AndroidOs {
	@Override
	public void off() {
		System.out.println("ColorOs off()");
	}
}

class OxygenOs implements AndroidOs {
	@Override
	public void off() {
		System.out.println("OxygenOs off()");
	}
}

class MiuiOs implements AndroidOs {
	@Override
	public void off() {
		System.out.println("MiuiOs off()");
	}
}

class GetOsObject {
	public static AndroidOs getOs(String osType) {
		if (osType.equalsIgnoreCase("coloros")) {
			return new ColorOs();
		} else if (osType.equalsIgnoreCase("oxygenos")) {
			return new OxygenOs();
		}
		return new MiuiOs();
	}
}

public class MultipleImpl {
	public static void main(String[] args) {
		java.util.Scanner scanner = new java.util.Scanner(System.in);
		System.out.println("Enter os name: ");
		String osName = scanner.next();
		AndroidOs androidOs = GetOsObject.getOs(osName);
		androidOs.off();
	}
}
