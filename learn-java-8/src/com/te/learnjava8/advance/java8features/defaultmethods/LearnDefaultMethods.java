package com.te.learnjava8.advance.java8features.defaultmethods;

interface AndroidOs {
	public abstract void powerOn();

	public abstract void powerOff();

	public abstract void optimizeBattery();

	public default void nightPhotography() {
		System.out.println("AndroidOs nightPhotography() implementation!");
	}
}

class Miui implements AndroidOs {

	@Override
	public void powerOn() {
		System.out.println("Miui powerOn() implementation!");
	}

	@Override
	public void powerOff() {
		System.out.println("Miui powerOff() implementation!");

	}

	@Override
	public void optimizeBattery() {
		System.out.println("Miui optimizeBattery() implementation!");

	}

}

class OxygenOs implements AndroidOs {

	@Override
	public void powerOn() {
		System.out.println("OxygenOs powerOn() implementation!");
	}

	@Override
	public void powerOff() {
		System.out.println("OxygenOs powerOff() implementation!");

	}

	@Override
	public void optimizeBattery() {
		System.out.println("OxygenOs optimizeBattery() implementation!");

	}

	@Override
	public void nightPhotography() {
		System.out.println("OxygenOs nightPhotography() implementation!");
	}
}

public class LearnDefaultMethods {
	public static void main(String[] args) {
		AndroidOs miui = new Miui();
		miui.nightPhotography();

		AndroidOs oxygen = new OxygenOs();
		oxygen.nightPhotography();
	}
}
