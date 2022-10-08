package com.te.learnjava8.basic.inheritance.upcasting;

interface AndroidOs {
	public abstract void powerOff();

	public abstract void powerOn();

	public abstract void optimizeBattery();

	public abstract void optimizePerformance();

	public abstract void unlock();
}

class Dev01AndroidOsImpl implements AndroidOs {

	@Override
	public void powerOff() {
		System.out.println("Dev01AndroidOsImpl powerOff()!");
	}

	@Override
	public void powerOn() {
		System.out.println("Dev01AndroidOsImpl powerOn()!");
	}

	@Override
	public void optimizeBattery() {
		System.out.println("Dev01AndroidOsImpl optimizeBattery()!");
	}

	@Override
	public void optimizePerformance() {
		System.out.println("Dev01AndroidOsImpl optimizePerformance()!");
	}

	@Override
	public void unlock() {
		System.out.println("Dev01AndroidOsImpl unlock()!");
	}
	
}

class Dev02AndroidOsImpl implements AndroidOs {

	@Override
	public void powerOff() {
		System.out.println("Dev02AndroidOsImpl powerOff()!");
	}

	@Override
	public void powerOn() {
		System.out.println("Dev02AndroidOsImpl powerOn()!");
	}

	@Override
	public void optimizeBattery() {
		System.out.println("Dev02AndroidOsImpl optimizeBattery()!");
	}

	@Override
	public void optimizePerformance() {
		System.out.println("Dev02AndroidOsImpl optimizePerformance()!");
	}

	@Override
	public void unlock() {
		System.out.println("Dev02AndroidOsImpl unlock()!");
	}
	
}

public class LearnInheritance02 {
	public static void main(String[] args) {
		AndroidOs os;
		
		String impl = "dev1";
		
		if (impl.equalsIgnoreCase("dev1")) {
			os = new Dev01AndroidOsImpl();
		} else {
			os = new Dev02AndroidOsImpl();
		}
		
		os.powerOn();
		os.powerOff();
	}
}
