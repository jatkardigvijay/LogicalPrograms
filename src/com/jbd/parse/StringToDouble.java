package com.jbd.parse;

import java.util.Scanner;

public class StringToDouble {

	public static void main(String[] args) {

		String string;
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a string : ");
		string = input.nextLine();
		checkFordouble(string);
		input.close();

	}

	private static void checkFordouble(String string) {

		double number;
		number = Double.parseDouble(string);
		System.out.println(number);
	}

}
