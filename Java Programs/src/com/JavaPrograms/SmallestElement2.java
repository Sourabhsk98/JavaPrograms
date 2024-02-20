package com.TodaysJavaPrograms;

import java.util.*;

public class SmallestElement2 {
    public static void main(String[] args)
    {
        int[] arr = new int[] { 25, 10, 74, 50, 5 };

        ArrayList<Integer> al = new ArrayList<>();
        System.out.println("Given array ");

        for (int i = 0; i < arr.length; i++) {

            System.out.println(arr[i]);
            // adding elements of array to arrayList.
            al.add(arr[i]);
        }
        System.out.println(
                "Smallest element: "
                        + Collections.min(al));
    }
}
