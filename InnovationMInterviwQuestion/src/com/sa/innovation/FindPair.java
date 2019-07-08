package com.sa.innovation;
//FIND AND PRINT ALL THE PAIR OF TWO NUMBERS IN ARRAY WHOSE SUMS ALREADY EXIST IN ARRAY.
import java.util.Scanner;
public class FindPair {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of array:");
		int n = sc.nextInt();
		int arr[] = new int[n];
		System.out.println("Enter Element:");
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		for (int i = 0; i < n; i++) {
			int sum = 0;
			for (int j = i + 1; j < n; j++) {
				sum = arr[i] + arr[j];
				for (int k = 0; k < n; k++) {
					if (sum == arr[k])
						System.out.println("{" + arr[i] + "," + arr[j] + "}");
				}
			}
		}
	}

}
