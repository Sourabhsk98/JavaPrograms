package com.TodaysJavaPrograms;

import java.util.Arrays;

public class PrintArrElements1{
    public static void main(String[] args)
    {
        // Initialize array
        // Array 'arr' contains 9 elements
        int[] arr = { -7, -5, 5, 10, 0, 3, 20, 25, 12 };

        System.out.print("Elements of given array are: ");

        // Pass the array 'arr' in Arrays.toString()
        // function to print array
        System.out.println(Arrays.toString(arr));
    }
}