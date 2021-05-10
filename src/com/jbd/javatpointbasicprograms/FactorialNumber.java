package com.jbd.javatpointbasicprograms;

import java.util.Scanner;

public class FactorialNumber {

	public static void main(String[] args) {

		int number, fact = 1;
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a number : ");
		number = input.nextInt();
		System.out.print("Factorial of " + number + " is : ");
		while (number != 0) {

			fact = fact * number;
			number--;
		}
		input.close();
		System.out.print(fact);
	}
}
