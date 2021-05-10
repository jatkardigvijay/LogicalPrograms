package com.jbd.javatpointbasicprograms;

import java.util.Scanner;

public class AsciiValueOfACharacter {

	public static void main(String[] args) {

		int number;
		char ch;
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a character : ");
		ch = input.next().charAt(0);
		number = ch;
		input.close();
		System.out.println("Ascii value of '" + ch + "' is : " + number);
	}
}
