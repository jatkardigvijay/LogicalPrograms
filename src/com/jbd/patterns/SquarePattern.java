package com.jbd.patterns;

import java.util.Scanner;

public class SquarePattern {

	public static void main(String[] args) {

		int number, i = 1, j;
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the number : ");
		number = input.nextInt();
		input.close();

		while (i <= number) {

			j = 1;
			while (j <= number) {

				System.out.print("* ");
				j++;
			}
			i++;
			System.out.println();

		}
	}
}
