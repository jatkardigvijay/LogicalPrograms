package com.jbd.arrays;

import java.util.Scanner;

public class CopyElementsOfOneArrayIntoAnother {

	public static void main(String[] args) {

		int count, elements[], copy[];
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the count of elements : ");
		count = input.nextInt();
		elements = new int[count];
		System.out.print("Enter the elements : ");
		for (int i = 0; i < count; i++) {
			elements[i] = input.nextInt();
		}
		input.close();
		System.out.print("Elements of array 1 : ");
		for (int i : elements) {
			System.out.print(i + " ");
		}
		copy = elements;
		System.out.println();
		System.out.print("Copied elemenets of array 1 into array 2 and the elements of array 2 are : ");
		for (int i2 : copy) {
			System.out.print(i2+" ");
		}

	}
}
