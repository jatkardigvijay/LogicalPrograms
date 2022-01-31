package com.jbd.arrays;

import java.util.Scanner;

public class BiggestNumberInAnArray {

	public static void main(String[] args) {

		int number, elements[];
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the count of numbers you want in an array : ");
		number = input.nextInt();
		elements = new int[number];
		System.out.print("Enter the " + number + " numbers : ");
		for (int i = 0; i < number; i++) {
			elements[i] = input.nextInt();

		}
		System.out.print("The elements in the array are : ");
		for (int i : elements) {
			System.out.print(i + " ");
		}
		int max = elements[0];

		for (int i = 1; i < elements.length; i++) {

			if (elements[i] > max) {
				max = elements[i];

			}

		}
		System.out.println();
		System.out.println("The biggest number in the array is : " + max);

	}

}
