package com.jbd.arrays;

import java.util.Scanner;

public class PrintElementsOfArrayPresentInOddPosition {

	public static void main(String[] args) {

		int number;
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the number of elements you want in an array : ");
		number = input.nextInt();
		int[] elements = new int[number];
		System.out.print("Enter the " + number + " elements : ");
		for (int i = 0; i < elements.length; i++) {

			elements[i] = input.nextInt();

		}
		input.close();
		System.out.print("Elements in an array are : ");
		for (int i : elements) {
			System.out.print(i + " ");
		}
		System.out.println();
		System.out.println("The elements in the array at odd position are : ");
		for (int i = 0; i < elements.length; i = i + 2) {
			System.out.print(elements[i] + " ");

		}

	}
}
