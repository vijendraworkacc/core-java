package com.te.learnjava8.basic;

public class CharacterSwapSpecial {
	// ab#g$f
	// fg#b$a

	public static void main(String[] args) {
		String input = "ab#g$f";
		int left = 0;
		int right = input.length() - 1;
		char[] charArray = input.toCharArray();
		System.out.println("INPUT: ");
		for (char c : charArray) {
			System.out.print(c);
		}
		while (left <= right) {
			char temp;
			if (charArray[left] >= 'a' && charArray[left] <= 'z') {
				if (charArray[right] >= 'a' && charArray[right] <= 'z') {
					temp = charArray[right];
					charArray[right] = charArray[left];
					charArray[left] = temp;
					left++;
					right--;
				} else {
					right--;
				}
			} else {
				left++;
			}
		}
		System.out.println("\nOUTPUT: ");
		for (char c : charArray) {
			System.out.print(c);
		}
	}
}
