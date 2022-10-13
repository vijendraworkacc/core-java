package com.te.learnjava8.apachecommens;

import org.apache.commons.lang3.StringUtils;

public class LearnApacheCommensLang {
	public static void main(String[] args) {
		String string = "This is a simple string!\n";
		String center = StringUtils.center("A", 10);
		System.out.println(center);
		String chomp = StringUtils.chomp(string);
		System.out.print(chomp);
		System.out.print("Hello!!!" + "\n");
		System.out.println(StringUtils.abbreviate(string, 20));
	}
}
