package com.jbd.string;

import java.util.Scanner;

public class RemoveDeplicateWordsInAString {

	public static void main(String[] args) {

		String string;
		Scanner input = new Scanner(System.in);
		string = input.nextLine();
		input.close();
		removeDuplicatesInAString(string);

	}

	private static void removeDuplicatesInAString(String string) {

		int count = 1;
		string = string.toLowerCase().trim();
		String words[] = string.split(" ");
		for (int i = 0; i < words.length; i++) {

			for (int j = i + 1; j < words.length; j++) {

				if (words[i].equals(words[j])) {
					count++;
					words[j] = "0";
				}
			}

			if (count > 1 && words[i] != "0") {
				System.out.print(words[i] + " ");
			}
		}

	}

}
