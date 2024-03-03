package com.TodaysJavaPrograms;

public class StringSubset2 {
    static void subString(String str, int n)
    {
        for (int i = 0; i < n; i++)      //To select the starting index
        {
            for (int j = i+1; j <= n; j++)    //To select the ending index
            {
                System.out.println(str.substring(i, j));
            }
        }
    }
    // Driver program to test above function
    public static void main(String[] args)
    {
        String str="Hello";
        System.out.println("The entered string are "+str);
        System.out.println("All the substrings of the above string is: ");
        //Call to find the all the subsets of the string
        subString(str, str.length());
    }
}
