package com.TodaysJavaPrograms;
// Reverse a Number using For loop.

public class ReverseNumber1 {
    public static void main(String[] args)
    {
        int n = 9876, rev = 0;
//we have not mentioned the initialization part of the for loop
        for( ;n != 0; n=n/10)
        {
            int remainder = n % 10;
            rev = rev * 10 + remainder;
        }
        System.out.println("The reverse of the given number is: " + rev);
    }
}