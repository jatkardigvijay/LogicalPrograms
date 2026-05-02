package com.jbd.arrays;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class ReversingAnArray {

	public static void main(String[] args) {

		int elements;
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the number of elements you want in an array : ");
		elements = input.nextInt();
		System.out.println("Enter the " + elements + " numbers : ");
		List<Integer> numberList = new ArrayList<Integer>();
		for (int i = 0; i < elements; i++) {
			numberList.add(input.nextInt());
		}
		System.out.println("The numbers you printed are : " + numberList);
		Collections.reverse(numberList);
		System.out.println("The reversed array is : " + numberList);

	}
}
