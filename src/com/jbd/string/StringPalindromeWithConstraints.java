package com.jbd.string;

import java.util.Scanner;

public class StringPalindromeWithConstraints {

	public static void main(String[] args) {
		
		String string, string1;
		StringBuilder string2 = new StringBuilder();
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a string : ");
		string = input.nextLine();
		input.close();
		string = string.trim().toLowerCase().replaceAll(" ", "");
		for (char c : string.toCharArray()) {
			if (Character.isLetterOrDigit(c)) {
				string2.append(Character.toLowerCase(c));
			}
		}
		StringBuilder reversed = new StringBuilder();
		for (int i = string2.length()-1; i >= 0; i--) {
			reversed.append(string2.charAt(i));
		}
		if (reversed.toString().equals(string2.toString())) {
			System.out.println("P");
		} else {
			System.out.println("NP");
		}
		
	}
}
