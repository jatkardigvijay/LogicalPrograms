package com.jbd.arrays;

import java.util.Scanner;

public class CopyOneArrayIntoAnother {

	public static void main(String[] args) {

		int number;
		int[] elements;
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the number of elements you want in an array : ");
		number = input.nextInt();
		elements = new int[number];
		System.out.println("Enter the " + number + " elements in an array : ");
		for (int i = 0; i < elements.length; i++) {
			elements[i] = input.nextInt();
		}
		input.close();
		System.out.println("The elements of 1st array are : ");
		for (int i : elements) {
			System.out.print(i + " ");
		}
		int[] array2 = new int[elements.length];
		System.arraycopy(elements, 0, array2, 0, number);
		System.out.println();
		System.out.println("1st array copied into second array ");
		System.out.println("Elements in the second array are : ");
		for (int i : array2) {
			System.out.print(i + " ");
		}
	}
}
