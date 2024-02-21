package com.TodaysJavaPrograms;

public class SumOfArray1 {
    static int arr[] = { 12, 3, 4, 1 };
    // method for sum of elements in an array
    static int sum()
    {
        int sum = 0,i;   // initialize sum
        // Iterate through all elements and add them to sum
        for (i = 0; i < arr.length; i++)
            sum += arr[i];
        return sum;
    }
    // Driver method
    public static void main(String[] args)
    {
        System.out.println("Sum of array is:" + sum());
    }
}