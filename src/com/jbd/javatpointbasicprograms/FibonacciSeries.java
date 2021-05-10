package com.jbd.javatpointbasicprograms;

import java.util.Scanner;

public class FibonacciSeries {

	public static void main(String[] args) {

		int num1 = 0, num2 = 1, num3, count;
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a number : ");
		count = input.nextInt();
		System.out.print("Fibonacci series till count " + count + " is : " + num1 + " " + num2);
		for (int i = 2; i <= count; i++) {

			num3 = num1 + num2;
			System.out.print(" " + num3);
			num1 = num2;
			num2 = num3;
		}
		input.close();
	}
}
