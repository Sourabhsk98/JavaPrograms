package com.TodaysJavaPrograms;

import java.util.ArrayList;

// Programs to check the number is positive, negative, or zero Using ArrayList Class.
public class FindPositiveNumber3 {
    public static void main(String[] args)
    {
//invoking method and prints the corresponding result
//parsing a positive value as a parameter
        System.out.println(positiveOrNegative(42));
//parsing zero as a parameter
        System.out.println(positiveOrNegative(0));
//parsing a negative value as a parameter
        System.out.println(positiveOrNegative(-190));
    }
    //method to check if the number is positive or negative
    public static String positiveOrNegative(int n)
    {
//object of the ArrayList class
        ArrayList<String> res = new ArrayList<String>();
//if n is 0, the response is Zero
//adds zero to the list
        res.add("Zero");
//the loop populates the ArrayList with elements "Positive" for n elements
        for(int i=0; i<n; i++)
        {
//adds result to the list
            res.add("Positive");
        }
        String res1="";
//try-catch block for the get() method because it throws IndexOutOfBoundsException
        try
        {
//the get() method returns the element at the specified position in this list
            res1=res.get(n);
        }
        catch (Exception e)
        {
//if the index is out of bounds, it must be negative
            res1="Negative";
        }
//returns the result
        return res1;
    }
}
