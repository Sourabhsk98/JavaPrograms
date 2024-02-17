package com.TodaysJavaPrograms;

import java.util.Arrays;
import java.util.Collections;

// Reversing an array using Java collections
public class ReverseArray4 {
    static void reverse(Integer a[])
    {
        Collections.reverse(Arrays.asList(a));
        System.out.println(Arrays.asList(a));
    }

    public static void main(String[] args)
    {
        Integer [] arr = {10, 20, 30, 40, 50};
        reverse(arr);
    }
}
