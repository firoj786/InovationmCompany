package com.sa.innovation;

import java.util.InputMismatchException;
import java.util.Scanner;

class Replace {
	static int searhAndReplace(int num) {
		if (num == 0)
			return 0;
		int digit = num % 10;
		if (digit == 0)
			digit = 1;
		return searhAndReplace(num / 10) * 10 + digit;
	}

	static int replace0To1(int num) {
		if (num == 0)
			return 1;
		else
			return searhAndReplace(num);
	}

	public static void main(String[] args) throws InputMismatchException {
		System.out.println("Enter any integer:");
		Scanner sc = new Scanner(System.in);
		try {
			int number = sc.nextInt();
			System.out.println(replace0To1(number));
		} catch (InputMismatchException nfe) {
			System.out.println("You can not be converted String to integer");
		}
	}
}