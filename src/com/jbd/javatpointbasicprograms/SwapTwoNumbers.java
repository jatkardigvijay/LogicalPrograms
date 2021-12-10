package com.jbd.javatpointbasicprograms;

import java.util.Scanner;

public class SwapTwoNumbers {

	public static void main(String[] args) {

		int number1, number2;
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a number : ");
		number1 = input.nextInt();
		System.out.println("Enter 2nd number : ");
		number2 = input.nextInt();
		System.out.println("Before swiping numbers are ");
		System.out.println("Number 1 : " + number1 + " and number : " + number2);
		input.close();
		swapNumber(number1, number2);
	}

	private static void swapNumber(int number1, int number2) {

		int temp;
		temp = number1;
		number1 = number2;
		number2 = temp;
		System.out.println("After swiping :");
		System.out.println("Number 1 : " + number1 + " and number 2 : " + number2);
	}
}
