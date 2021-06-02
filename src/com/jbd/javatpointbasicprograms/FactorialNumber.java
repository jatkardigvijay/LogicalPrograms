package com.jbd.javatpointbasicprograms;

import java.util.Scanner;

public class FactorialNumber {

	public static void main(String[] args) {

		int number;
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a number whose factorial is to be calculated : ");
		number = input.nextInt();
		input.close();
		factorial(number);
	}

	private static void factorial(int number) {

		int fact = 1, temp;
		temp = number;

		while (number != 0) {

			fact = fact * number;
			number--;
		}

		number = temp;

		System.out.println("Factorial of the number " + number + " is : " + fact);
	}
}
