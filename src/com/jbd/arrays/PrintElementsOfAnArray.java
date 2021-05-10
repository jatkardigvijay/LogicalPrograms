package com.jbd.arrays;

import java.util.Scanner;

public class PrintElementsOfAnArray {

	public static void main(String[] args) {

		int count, elements[];
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the count of elements you want in an array : ");
		count = input.nextInt();
		elements = new int[count];
		System.out.print("Enter the elements : ");
		for (int i = 0; i < count; i++) {
			elements[i] = input.nextInt();
		}
		input.close();
		System.out.print("The elements are : ");
		for (int i : elements) {
			System.out.print(i+" ");
		}
	}
}
