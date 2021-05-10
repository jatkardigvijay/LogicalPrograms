package com.jbd.javatpointbasicprograms;

import java.util.Scanner;

public class ReverseANumber {

	public static void main(String[] args) {

		int number;
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a number : ");
		number = input.nextInt();
		input.close();
		reverseANumber(number);
	}

	private static void reverseANumber(int number) {

		int reverse = 0, temp, remainder;
		temp = number;
		while (number != 0) {

			remainder = number % 10;
			reverse = reverse * 10 + remainder;
			number = number / 10;
		}
		number = temp;
		System.out.println("Reverse of " + number + " is : " + reverse);
	}
}
