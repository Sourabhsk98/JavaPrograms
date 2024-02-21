package com.TodaysJavaPrograms;

public class SumOfArray3 {
    public static int sumArray(int[] arr, int n) {
        if (n == 0) {
            return arr[n];
        }
        return arr[n] + sumArray(arr, n-1);
    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int n = arr.length;
        int sum = sumArray(arr, n-1);
        System.out.println("Sum of the elements in the array: " + sum);
    }
}
