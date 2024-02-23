package com.TodaysJavaPrograms;

import java.util.*;
public class SortArray1 {
    public static void main(String[] args)
    {
        // Initialize array
        // The array contains 6 elements.
        int[] array = new int[] { -5, -9, 8, 12, 1, 3 };

        // Displaying elements of original array
        System.out.print("Elements of original array: ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        // Using Arrays.sort() method to sort array
        // elements in ascending order.
        Arrays.sort(array);

        System.out.println();

        // Displaying elements of array after sorting
        System.out.println("Sorted Array : " + Arrays.toString(array));
    }
}
