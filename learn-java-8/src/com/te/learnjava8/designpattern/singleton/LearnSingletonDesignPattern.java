package com.te.learnjava8.designpattern.singleton;

public class LearnSingletonDesignPattern {
	public static void main(String[] args) {
		Abdul abdul = Abdul.getAbdul();
		Abdul abdul_ = Abdul.getAbdul();
		Abdul abdul_1 = Abdul.getAbdul();
		System.out.println(abdul);
		System.out.println(abdul_);
		System.out.println(abdul == abdul_);
		System.out.println(abdul == abdul_1);
	}
}
