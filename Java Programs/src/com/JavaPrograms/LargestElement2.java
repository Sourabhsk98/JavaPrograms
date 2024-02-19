package com.TodaysJavaPrograms;

public class LargestElement2 {
        // Returns maximum in arr[] of size n
        static int largest(int arr[], int n) {
            for (int i = 1; i < n; ++i) {
                int key = arr[i];
                int j = i - 1;
                // Move elements of arr[0..i-1], that are greater than key,
                // to one position ahead of their current position
                while (j >= 0 && arr[j] > key) {
                    arr[j + 1] = arr[j];
                    j = j - 1;
                }
                arr[j + 1] = key;
            }
            return arr[n-1];
        }
         public static void main(String[] args) {
            int[] arr = {10, 32, 45, 80, 99};
            int n = arr.length;
            System.out.println(largest(arr, n));
        }
    }

