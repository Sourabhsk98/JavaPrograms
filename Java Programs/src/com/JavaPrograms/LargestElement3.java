package com.TodaysJavaPrograms;

import java.util.*;

public class LargestElement3 {
    public static void main(String[] args)
    {
        int arr[] = { 12,   45,  67,  89,  100, 23, 34, 89, 4, 90, 70 };
        // Sorting function using
        // Sort function
        Arrays.sort(arr);

        // Printing the Result
        System.out.println("Largest number in array: " + arr[arr.length - 1]);
    }
}
