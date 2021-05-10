package com.jbd.javatpointbasicprograms;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {

		int number, i, j, k = 0;
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a number : ");
		number = input.nextInt();
		j = number / 2;
		for (i = 2; i <= j; i++) {

			if (number % i == 0) {
				k = 1;
				break;
			}
		}
		input.close();
		if (number == 1) {
			System.out.println(number + " is not a prime nor a composite number");
		} else if (k == 1) {
			System.out.println(number + " is not a prime number");
		} else {
			System.out.println(number + " is a prime number");
		}
	}
}
