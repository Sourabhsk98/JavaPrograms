package com.TodaysJavaPrograms;

import java.util.Scanner;

// Programs to check the number is positive, negative, or zero Using Bit Shift Operator.
public class FindPositiveNumber2 {
    public static void main(String[] args)
    {
        int num, result;
//object of the Scanner class
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number you want to check: ");
//taking an integer value from the user
        num = sc.nextInt();
//string array that contains results
        String[] res1 = {"Positive", "Negative"};
//checks if the number is positive or negative
        System.out.println(res1 [(num >> 31) & 1]);
    }
}
