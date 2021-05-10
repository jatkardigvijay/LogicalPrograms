package com.jbd.javatpointbasicprograms;

import java.util.Scanner;

public class MultiplicationTable {

	public static void main(String[] args) {

		int number;
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a number whose multiplication table is to be printed : ");
		number = input.nextInt();
		input.close();
		multiplicationTable(number);
	}

	private static void multiplicationTable(int number) {

		for (int i = 1; i < 11; i++) {

			System.out.println(number + " x " + i + " = " + (number * i));
		}
	}
}
