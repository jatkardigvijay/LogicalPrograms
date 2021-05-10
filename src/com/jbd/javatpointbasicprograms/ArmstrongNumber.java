package com.jbd.javatpointbasicprograms;

import java.util.Scanner;

public class ArmstrongNumber {

	public static void main(String[] args) {

		int number, remainder, sum = 0, temp;
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a number : ");
		number = input.nextInt();
		temp = number;
		while (number != 0) {

			remainder = number % 10;
			sum = sum + (remainder * remainder * remainder);
			number = number / 10;
		}
		input.close();
		number = temp;

		if (number == sum) {
			System.out.println(number + " is an armstrong number");
		} else {
			System.out.println(number + " is not an armstrong number");
		}
	}
}
