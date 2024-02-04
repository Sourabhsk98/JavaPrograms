package com.TodaysJavaPrograms;

 //Java program to find the square root of a number
//Simple Program (With inbuilt function)
import java.util.Scanner;

public class SquareRoot3 {
    public static void main(String[] args) {

        System.out.print("Please enter the number : ");
        Scanner input = new Scanner(System.in);

        float num = input.nextFloat();
        //Printing the output
        System.out.println("Square root of "+ num+ " is: "+Math.sqrt(num));
    }
}