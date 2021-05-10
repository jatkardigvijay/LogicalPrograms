package com.jbd.string;

import java.util.Scanner;

public class StringPalindrome {

	public static void main(String[] args) {

		String string;
		Scanner input = new Scanner(System.in);
		string = input.nextLine();
		input.close();
		stringPalindrome(string);
	}

	private static void stringPalindrome(String string) {

		String reverse = "", temp;
		string = string.trim();
		temp = string;
		char[] ch = string.toCharArray();
		for (int i = ch.length - 1; i >= 0; i--) {

			reverse = reverse + ch[i];
		}

		string = temp;
		if (string.equals(reverse)) {
			System.out.println(string + " is a palindrome string");
		} else {
			System.out.println(string + " is not a palindrome string");
		}
	}
}
