package com.TodaysJavaPrograms;

import java.util.*;

// Java program to sort the elements in descending order Using Collections.reverseOrder() method.
public class SortArray4 {
    public static void main(String[] args)
    {

        // Initializing the array
        Integer array[] = { 1, 2, 3, 4, 5 };

        // Sorting the array in descending order
        Arrays.sort(array, Collections.reverseOrder());

        // Printing the elements
        System.out.println(Arrays.toString(array));
    }
}
