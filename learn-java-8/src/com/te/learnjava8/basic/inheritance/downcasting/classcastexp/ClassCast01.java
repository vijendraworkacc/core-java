package com.te.learnjava8.basic.inheritance.downcasting.classcastexp;

class Aa {
	int a = 10;
}

class Bb extends Aa {
	int b = 20;
}

public class ClassCast01 {
	public static void main(String[] args) {
		Bb b = (Bb) new Aa(); // ClassCastException!
	}
}
