package com.te.learnjava8.designpattern.prototype;

public class LearnPrototypeDesignPattern {
	public static void main(String[] args) {
		ComplexObject object1 = new ComplexObject(7964, 4242, 242, 45245, 45455, 111, 76767, 89898, 35367, 23322,
				7589595);
		ComplexObject object2 = null;
		try {
			object2 = (ComplexObject) object1.clone();
		} catch (CloneNotSupportedException e) {
			System.out.println(e.getMessage());
		}
		System.out.println(object1 + "\n");

		System.out.println(object2 + "\n");

		System.out.println(object1 == object2);
	}
}
