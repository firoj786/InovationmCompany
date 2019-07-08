package com.sa.innovation;

import java.util.Scanner;

class SecondLarge {
    public static void printSecondLarge(int arr[]) {
        int i, first, second;
        if (arr.length < 2) {
            System.out.print(" wrong input ");
            return;
        }
        first = second = Integer.MIN_VALUE;
        for (i = 0; i < arr.length; i++) {
            if (arr[i] > first) {
                second = first;
                first = arr[i];
            } else if (arr[i] > second && arr[i] != first)
                second = arr[i];
        }
        if (second == Integer.MIN_VALUE)
            System.out.print("There is no second largest" + " element\n");
        else
            System.out.print("Output: " + second);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Size of array");
        int n = sc.nextInt();
        System.out.println("Enter array elements");
        int arr[] = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        printSecondLarge(arr);
    }
}