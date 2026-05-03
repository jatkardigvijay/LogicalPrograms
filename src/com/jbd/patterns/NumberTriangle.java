package com.jbd.patterns;

import java.util.Iterator;
import java.util.Scanner;

public class NumberTriangle {

	public static void main(String[] args) {
		
		int numberOfRows;
		Scanner input = new Scanner(System.in);
		System.out.println("Enter number of rows : ");
		numberOfRows = input.nextInt();
		input.close();
		for (int i = 1; i <= numberOfRows; i++) {
			
			for (int j = 1; j <= i; j++) {
				System.out.print(j+" ");
			}
			System.out.println();
		}
	}
}
