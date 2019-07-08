package com.sa.innovation;

import java.util.Scanner;

public class DuplicateString {
//WRITE A PROGRAM TO REMOVE DUPLICATE STRING FROM A SENTENCE WITH OUT USING ANY PREDEFINEDMETHOD.
	public static void main(String[] args) {
		System.out.println("Enter Sentence:");
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		String[] words = str.split(" ");
		for (int i = 0; i < words.length; i++) {
			if (words[i] != null) {
       for (int j = i + 1; j < words.length; j++) {
        if (words[i].equals(words[j])) {
						words[j] = null;
					}
				}
			}
		}
		for (int k = 0; k < words.length; k++) {
			if (words[k] != null) {
				System.out.print(words[k] + " ");
			}

		}
	}
}