package com.te.learnjava8.basic.exceptions;

public class LearnException3 {

	public static void main(String[] args) {
		try {
			System.out.println("In try before statement!");
			int a = 10 / 2;
			System.exit(0);
			System.out.println("In try after statement!");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		} finally {
			System.out.println("finally executed!");
		}
	}
}
