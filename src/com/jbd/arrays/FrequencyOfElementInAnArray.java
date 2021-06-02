package com.jbd.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class FrequencyOfElementInAnArray {

	public static void main(String[] args) {

		// 2 3 5 2 3 2 4 5 4

		int number;
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
		System.out.println();
		input.close();
		int n = elements.length;
		countFreq(elements, n);

	}

	private static void countFreq(int[] elements, int n) {

		boolean[] visited = new boolean[n];

		Arrays.fill(visited, false);

		// Traverse through array elements and
		// count frequencies
		for (int i = 0; i < n; i++) {

			// Skip this element if already processed
			if (visited[i] == true) {

				continue;
			}

			// Count frequency
			int count = 1;
			for (int j = i + 1; j < n; j++) {

				if (elements[i] == elements[j]) {

					visited[j] = true;
					count++;
				}
			}
			System.out.println(elements[i] + " " + count);
		}
	}
}
