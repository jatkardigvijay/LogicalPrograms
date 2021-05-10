package com.jbd.javatpointbasicprograms;

import java.util.Scanner;

public class SumOfDigitsInAnInteger {

	public static void main(String[] args) {

		int number;
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a number : ");
		number = input.nextInt();
		input.close();
		sumOfDigits(number);
	}

	private static void sumOfDigits(int number) {

		int sum = 0, remainder, temp;

		temp = number;

		while (number != 0) {

			remainder = number % 10;
			sum = sum + remainder;
			number = number / 10;
		}

		number = temp;

		System.out.println("Sum of digits in the number : " + number + " is : " + sum);
	}
}
