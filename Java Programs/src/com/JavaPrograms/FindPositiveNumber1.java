package com.TodaysJavaPrograms;

/* Programs to check the number is positive, negative, or zero Using Math.signum() Method.
It returns the signum function of the argument, as follows:

0: if the argument is 0.
1: if the argument>0.
-1: if the argument<0.*/

import java.util.Scanner;

public class FindPositiveNumber1 {
    public static void main(String[] args)
    {
        double num, result;
//object of the Scanner class
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number you want to check: ");
//reading an input from the user
        num = sc.nextDouble();
//invoking signum() method of the Math class
        result=Math.signum(num);
//print the result
        System.out.print(result);
    }
}
