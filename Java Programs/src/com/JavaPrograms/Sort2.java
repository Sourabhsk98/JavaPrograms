package com.TodaysJavaPrograms;

import java.util.*;
public class Sort2 {
    public static void main(String[] args)
    {
        Integer [] array = {40,60,90,70,30,20,50};
// sorts array[] in descending order
        Arrays.sort(array, Collections.reverseOrder());
        System.out.println("Array elements in descending order: " +Arrays.toString(array));
    }
}
