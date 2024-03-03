package com.TodaysJavaPrograms;

import java.util.*;
public class StringSubset1 {
    static void subString(char str[], int n) {
        // To select starting point
        for (int t = 1; t <= n; t++) {
            // To select ending point
            for (int i = 0; i <= n - t; i++) {
                //  Print characters from selected
                // starting to end point.
                int j = i + t - 1;
                for (int k = i; k <= j; k++) {
                    System.out.print(str[k]);
                }

                System.out.println();
            }
        }
    }
    public static void main(String[] args) {
        //Take input from the user
        Scanner sc = new Scanner(System.in);
        String str1 = null;
        System.out.println("Enter the string is " + str1);
        str1 = sc.nextLine();
        char str[] = str1.toCharArray();
        System.out.println("All the substrings of the above string are: ");
        subString(str, str.length);
    }
}
