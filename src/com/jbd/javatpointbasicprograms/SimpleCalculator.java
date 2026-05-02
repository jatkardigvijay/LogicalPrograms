package com.jbd.javatpointbasicprograms;

import java.util.Scanner;

public class SimpleCalculator {

	public static void main(String[] args) {
		
		double num1, num2;
		char c;
		Scanner input = new Scanner(System.in);
		c = input.next().charAt(0);
		num1 = input.nextDouble();
		num2 = input.nextDouble();
		input.close();
		switch (c) {
		case '+':
			System.out.println(num1 + num2);
			break;
		case '-':
			System.out.println(num1 - num2);
			break;
		case '*':
			System.out.println(num1 * num2);
			break;
		case '/':
			System.out.println(num1 / num2);
			break;
		default:
			break;
		}
		
	}
}
