package com.TodaysJavaPrograms;

import java.util.Scanner;
public class SquareRoot4 {
        //Custom method to find square root
        public static double findSquareRoot(float number){
            double num = number / 2;
            double temp;
            do
            {
                temp = num;
                num = (temp + (number / temp)) / 2;
            }while ((temp-num) != 0 );

            //Returning the result
            return num;

        }
        //Main method of the program
        public static void main(String[] args) {
            //Giving hint to the user for, What to enter
            System.out.print("Please enter the number : ");
            //Creating the object of Scanner Class
            Scanner input = new Scanner(System.in);
            //Taking input from user
            float n1 = input.nextFloat();
            //Printing the result
            System.out.println("Square root of "+ n1+ " is: "+findSquareRoot(n1));
        }
}