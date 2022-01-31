package com.jbd.string;

import java.util.Scanner;

public class StringWordsReverse {

	public static void main(String[] args) {

		String inputString, answer = "";
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a string : ");
		inputString = input.nextLine();
		inputString = inputString.trim();
		input.close();
		String words[] = inputString.split(" ");
		for (int i = words.length - 1; i >= 0; i--) {
			answer = answer + words[i] + " ";

		}
		System.out.println("The answers is : " + answer);
	}
}
