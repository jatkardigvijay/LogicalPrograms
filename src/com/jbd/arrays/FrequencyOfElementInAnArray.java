package com.jbd.arrays;

import java.util.Scanner;

public class FrequencyOfElementInAnArray {

	public static void main(String[] args) {

		int number, visited = -1;
		Scanner input = new Scanner(System.in);
		System.out.print("Enter number of elements you want to enter in an array : ");
		number = input.nextInt();
		System.out.print("Enter the " + number + " numbers : ");
		int[] elements = new int[number];
		for (int i = 0; i < elements.length; i++) {
			elements[i] = input.nextInt();
		}
		System.out.print("The " + number + " numbers are : ");
		for (int i : elements) {
			System.out.print(i + " ");
		}
		for (int i = 0; i < elements.length; i++) {

			int count = 1;

			for (int j = i + 1; j < elements.length; j++) {

				if (elements[i] == elements[j]) {
					count++;

					elements[j] = visited;
				}
			}

			if (elements[i] != visited) {

				elements[i] = count;
			}
		}
		input.close();

		System.out.println();
		System.out.println("---------------------------------------");
		System.out.println(" Element | Frequency");
		System.out.println("---------------------------------------");
		for (int i = 0; i < elements.length; i++) {
			if (elements[i] != visited)
				System.out.println("    " + elements[i+1] + "    |    " + elements[i]);
		}
		System.out.println("----------------------------------------");
	}
}
