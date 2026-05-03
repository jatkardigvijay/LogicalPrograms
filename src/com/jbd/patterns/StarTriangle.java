package com.jbd.patterns;

import java.util.Scanner;

public class StarTriangle {

	public static void main(String[] args) {
		
		int numberOfRows;
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the number of rows : ");
		numberOfRows = input.nextInt();
		input.close();
		for (int i = 0; i < numberOfRows; i++) {
			
			for (int j = 0; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
