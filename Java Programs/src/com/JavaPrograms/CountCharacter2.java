package com.TodaysJavaPrograms;

//Java Program to count the total number of characters in a string using a do-while loop
import java.util.*;
public class CountCharacter2 {
    public static void main(String[] args)
    {
        //Take input from the user
        Scanner sc=new Scanner(System.in);
        int count = 0,i=0;
        System.out.println("Please Enter a String to Count Characters =  ");
        String str = sc.nextLine();
        //Use a while loop to calculate the total characters
        do
        {
            if(str.charAt(i)!=' ')
            {
                // this condition is used to avoid counting space
                count++;
            }
            i++;
        }while(i<str.length());
        //Print the total number of characters in the given string
        System.out.print("The total number of character in a string:"+count);
    }
}
