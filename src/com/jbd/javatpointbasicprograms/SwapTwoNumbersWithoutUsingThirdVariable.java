package com.jbd.javatpointbasicprograms;

import java.util.Scanner;

public class SwapTwoNumbersWithoutUsingThirdVariable {

	public static void main(String[] args) {

		int number1, number2;
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a number : ");
		number1 = input.nextInt();
		System.out.println("Enter a number : ");
		number2 = input.nextInt();
		input.close();
		System.out.println("Before swap number 1 is : "+number1 +" and number 2 : "+number2);
		swapTwoNumbers(number1, number2);

	}

	private static void swapTwoNumbers(int number1, int number2) {

		number1 = number1 + number2;
		number2 = number1 - number2;
		number1 = number1 - number2;
		System.out.println("After swap number 1 is : "+number1 +" and number 2 : "+number2);
		
	}
}
