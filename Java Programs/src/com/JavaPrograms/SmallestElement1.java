package com.TodaysJavaPrograms;

import java.util.Arrays;

public class SmallestElement1 {
    public static void main(String[] args)
    {
        // Array elements initialisation
        int[] Arr = new int[] { 25, 10, 74, 50, 5 };

        System.out.println("Given array ");
        for (int i = 0; i < Arr.length; i++) {

            System.out.println(Arr[i]);
        }
        // sort the array
        Arrays.sort(Arr);

        int minValue = Arr[0];

        System.out.println("Smallest element: " + minValue);
    }
}
