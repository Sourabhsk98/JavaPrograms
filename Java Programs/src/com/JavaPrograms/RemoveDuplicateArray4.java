package com.TodaysJavaPrograms;

import java.util.*;
public class RemoveDuplicateArray4 {
    public static void removeDuplicates(int[] a)
    {
        LinkedHashSet<Integer> set = new LinkedHashSet<>();

        // adding elements to LinkedHashSet
        for (int i = 0; i < a.length; i++)
            set.add(a[i]);

        // Print the elements of LinkedHashSet
        System.out.print(set);
    }
    public static void main(String[] args)
    {
        int a[] = {10,20,20,30,30,40,50,50};
        // Function call
        removeDuplicates(a);
    }
}
