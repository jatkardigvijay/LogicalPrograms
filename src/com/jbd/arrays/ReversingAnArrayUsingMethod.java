package com.jbd.arrays;

import java.util.Iterator;
import java.util.Scanner;

public class ReversingAnArrayUsingMethod {

	public static void main(String[] args) {
		
		int numberOfElements;
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the number of elements in an array : ");
		numberOfElements = input.nextInt();
		int[] array1 = new int[numberOfElements];
		for (int i = 0; i < array1.length; i++) {
			array1[i] = input.nextInt();
		}
		input.next();
		for (int i : array1) {
			System.out.print(i+" ");
		}
		System.out.println();
		for (int i = array1.length - 1; i >= 0; i--) {
			System.out.print(array1[i]+ " ");
		}
	}
}
