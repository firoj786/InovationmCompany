package com.sa.innovation;

import java.util.Scanner;

class SortArray {
    public void sortMethod(int arr[], int n) {
        for (int i = 0; i < arr.length / 2; i++) {
            for (int j = 0; j < arr.length / 2; j++) {
                if (arr[j] > arr[i]) {
                    int temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }
            }
        }
        for (int i = 0; i < arr.length / 2; i++) {
            System.out.print(arr[i] + " ");
        }
        for (int i = n - 1; i >= arr.length / 2; i--) {
            for (int j = n - 1; j >= arr.length / 2; j--) {
                if (arr[j] < arr[i]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        for (int i = n - 1; i >= arr.length / 2; i--) {
            System.out.print(arr[i] + " ");
        }
    }
    public static void main(String[] args) {
        SortArray sa = new SortArray();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Size of array:");
        int n = sc.nextInt();
        System.out.println("Enter array elements:");
        int arr[] = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        sa.sortMethod(arr, n);
    }
}