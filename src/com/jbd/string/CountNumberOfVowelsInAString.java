package com.jbd.string;

import java.util.Scanner;

public class CountNumberOfVowelsInAString {

	public static void main(String[] args) {

		String string;
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a string : ");
		string = input.nextLine();
		input.close();
		vowelsInAString(string);

	}

	private static void vowelsInAString(String string) {

		int count = 0;
		char[] ch = string.toLowerCase().toCharArray();

		for (char c : ch) {

			if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {

				count++;
			}
		}
		System.out.println(count);
	}
}
