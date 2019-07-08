package com.sa.innovation;
import java.util.Arrays;
import java.util.Scanner;
class SortArrayMethod {
    void printArray(int[] arr) {
        Arrays.sort(arr);
        for (int i = 0; i < arr.length / 2; i++)
            System.out.print(arr[i] + " ");
        for (int j = arr.length - 1; j >= arr.length / 2; j--)
            System.out.print(arr[j] + " ");
}
 public static void main(String[] args) {
    SortArrayMethod  sa = new SortArrayMethod ();
        Scanner sc = new Scanner(System.in );
        System.out.println("Enter Size of array:");
        int n = sc.nextInt();
        System.out.println("Enter array elements:");
        int arr[] = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        sa.printArray(arr);
    }  
}