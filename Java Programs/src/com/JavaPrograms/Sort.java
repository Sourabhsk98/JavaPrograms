package com.TodaysJavaPrograms;

import java.util.*;
public class Sort {
    public static void main(String[] args)
    {
//defining an array of integer type
        int [] array = new int [] {40,60,90,70,30,20,50};
//invoking sort() method of the Arrays class
        Arrays.sort(array);
        System.out.println("Elements of array sorted in ascending order: ");
//prints array using the for loop
        for (int i = 0; i < array.length; i++)
        {
            System.out.println(array[i]);
        }
    }
}
