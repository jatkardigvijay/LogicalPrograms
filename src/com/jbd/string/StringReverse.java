package com.jbd.string;

import java.util.Scanner;

public class StringReverse {

	public static void main(String[] args) {

		String string;
		Scanner input = new Scanner(System.in);
		string = input.nextLine();
		input.close();
		stringReverse(string);
	}

	private static void stringReverse(String string) {

		string = string.trim();
		String reverse = "";
		char[] ch = string.toCharArray();
		for (int i = ch.length - 1; i >= 0; i--) {

			reverse = reverse + ch[i];
		}
		System.out.println("The reverse of the string is : " + reverse);
	}
}
