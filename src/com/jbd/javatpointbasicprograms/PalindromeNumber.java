package com.jbd.javatpointbasicprograms;

import java.util.Scanner;

public class PalindromeNumber {

	public static void main(String[] args) {

		int number, reverse = 0, remainder, temp;
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a number : ");
		number = input.nextInt();
		temp = number;
		while (number != 0) {
			remainder = number % 10;
			reverse = (reverse * 10) + remainder;
			number = number / 10;
		}
		input.close();
		number = temp;
		if (reverse == number) {
			System.out.println(number + " is palindrome");
		} else {
			System.out.println(number + " is not a palindrome");
		}
	}
}