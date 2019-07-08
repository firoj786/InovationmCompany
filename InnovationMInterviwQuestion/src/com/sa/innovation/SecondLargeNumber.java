package com.sa.innovation;

import java.util.Scanner;

class SecondLargeNumber {
    public static void main(String[] args) {
        int n, temp;
        Scanner Sc = new Scanner(System.in);
        System.out.print("Enter number of elements : ");
        n = Sc.nextInt();
        int a[] = new int[n];
        System.out.println("Enter all the elements:");
        for (int i = 0; i < n; i++) {
            a[i] = Sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (a[i] > a[j]) {
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
        if (a[n - 1] == a[n - 2]) {
            System.out.println("Output :" + a[n - 3]);
        } 
        else {
            System.out.println("Output :" + a[n - 2]);
        }
    }
}