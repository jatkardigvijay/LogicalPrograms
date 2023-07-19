package com.jbd.string;

import java.util.Scanner;

public class NumberPalindrome {

	public static void main(String[] args) {

		int num, reverse = 0, temp, reminder;
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a number : ");
		num = input.nextInt();
		input.close();

		temp = num;

		while (num > 0) {

			reminder = num % 10;
			reverse = reverse*10 + reminder;
			num = num / 10;
		}
		
		if (temp == reverse) {
			System.out.println("p");
		} else {
			System.out.println("NP");
		}

	}
}
