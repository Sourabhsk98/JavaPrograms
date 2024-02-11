package com.TodaysJavaPrograms;

// Program to Display Odd Numbers From 1 to 100 Using While Loop.
import java.util.Scanner;

public class DisplayEvenNo1 {
    public static void main(String[] args)
    {
        int number, i;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the limit: ");
        number = sc.nextInt();
        i=2;
        System.out.print("Lit of even numbers: ");
//the while loop executes until the condition become false
        while(i<=number)
        {
//prints the even number
            System.out.print(i +" ");
//increments the variable i by 2
            i=i+2;
        }
    }
}