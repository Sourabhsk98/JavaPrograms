package com.TodaysJavaPrograms;

//method that returns the sum of n natural numbers
public class NumberNumber3 {
    static int Sum(int n) {
        int sum = 0;
//executes until the condition becomes false
        for (int i = 1; i <= n; i++)
//adding the value of i to the sum variable
            sum = sum + i;
        return sum;
    }

    //main method
    public static void main(String args[]) {
        int n = 50;
//calling method and prints the sum
        System.out.println("Sum of Natural Numbers is: " + Sum(n));
    }
}