package com.sa.innovation;

import java.util.Scanner;

class WrongSeriesAP {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in );
        System.out.println("Enter size of array:");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter array elements:");
        for (int a = 0; a < n; a++) {
            arr[a] = sc.nextInt();
        }
        int diff = 0;
        int d[] = new int[n];
        for (int i = 0; i < n - 1; i++) {
            d[i] = arr[i + 1] - arr[i];
        }
        breakLoop: for (int j = 0; j < n - 1; j++) {
            for (int k = j + 1; k < n - 1; k++) {
                if (d[j] == d[k]) {
                    diff = d[j];
                    break breakLoop;
                }
            }
        }
        System.out.println("Wrong Terms");
        for (int l = 0; l < n - 1; l++) {
            if ((arr[l] + diff) != arr[l + 1]) {
                if (arr[l + 1] == arr[n - 1]) {
                    System.out.print(arr[l + 1] + " ");
                } else if (arr[l + 1] + diff != arr[l + 2]) {
                    System.out.print(arr[l + 1] + " ");
                    l++;
                } else {
                    System.out.print(arr[l] + " ");
                }
            }
        }
    }
}