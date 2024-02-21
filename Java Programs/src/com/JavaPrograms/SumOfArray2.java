package com.TodaysJavaPrograms;

// import Arrays class to use inbuilt sum() method
 import java.util.*;
public class SumOfArray2 {
    public static void main (String[] args) {
        int []num = {1,2,3,4,5};
        int sum = Arrays.stream(num).sum();
        System.out.println(sum);
    }
}
