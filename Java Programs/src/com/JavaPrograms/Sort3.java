package com.TodaysJavaPrograms;

import java.util.*;
public class Sort3 {
    public static void main(String[] args)
    {
        String [] strarray = {"Mango", "Apple", "Grapes", "Papaya", "Pineapple", "Banana", "Orange"};
// sorts array[] in descending order
        Arrays.sort(strarray, Collections.reverseOrder());
        System.out.println("Array elements in descending order: " +Arrays.toString(strarray));
    }
}
