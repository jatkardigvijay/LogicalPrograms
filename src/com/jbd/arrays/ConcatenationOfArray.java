package com.jbd.arrays;

import java.util.Scanner;

public class ConcatenationOfArray {

	public static void main(String[] args) {
		
		int numberOfElements;
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the number of elements in an array : ");
		numberOfElements = input.nextInt();
		int[] array1 = new int[numberOfElements];
		for (int i = 0; i < array1.length; i++) {
			array1[i] = input.nextInt();
		}
		for (int i : array1) {
			System.out.print(i+" ");
		}
		int[] result = new int[numberOfElements * 2];
		for (int i = 0; i < array1.length; i++) {
			result[i] = array1[i];
			result[i + numberOfElements] = array1[i]; 
		}
		System.out.println();
		for (int i : result) {
			System.out.print(i+" ");
		}
	}
}
