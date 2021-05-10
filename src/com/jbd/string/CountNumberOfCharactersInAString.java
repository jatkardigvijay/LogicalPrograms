package com.jbd.string;

import java.util.Scanner;

public class CountNumberOfCharactersInAString {

	public static void main(String[] args) {

		String string;
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a string : ");
		string = input.nextLine();
		checkNumberOfCharactersInAString(string);
		input.close();
	}

	private static void checkNumberOfCharactersInAString(String string) {

		int count = 0;

		for (int i = 0; i < string.length(); i++) {

			if (string.charAt(i) != ' ') {
				count++;
			}

		}
		System.out.println("The count is : " + count);

	}

}
