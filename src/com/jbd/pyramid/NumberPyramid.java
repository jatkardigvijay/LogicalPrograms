package com.jbd.pyramid;

import java.util.Scanner;

public class NumberPyramid {

	public static void main(String[] args) {

		int numOfRows, rowCount = 1;
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the number of rows : ");
		numOfRows = input.nextInt();
		System.out.println("Number of rows is : " + numOfRows);
		input.close();
		System.out.println("The pyramid pattern is : ");
		for (int i = numOfRows; i > 0; i--) {

			for (int j = 1; j <= i; j++) {

				System.out.print(" ");
			}
			for (int j = 1; j <= rowCount; j++) {

				System.out.print(rowCount + " ");
			}

			System.out.println();
			rowCount++;

		}
	}
}
