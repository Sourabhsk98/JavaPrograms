package com.TodaysJavaPrograms;

/* Program To reverse a number,
1.First, we find the remainder of the given number by using the modulo (%) operator.
2.Multiply the variable reverse by 10 and add the remainder into it.
3.Divide the number by 10.
Repeat the above steps until the remainder becomes 0.
Eg :Given no:= 9876 ---> Reversed No:= 6789 */

// Reverse a Number using While loop.
public class ReverseNumber {
    public static void main(String[] args)
    {
        int n = 1234, rev = 0;
        while(n != 0)
        {
            int remainder = n % 10;
            rev = rev * 10 + remainder;
            n = n/10;
        }
        System.out.println("The reverse of the given number is: " + rev);
    }
}
