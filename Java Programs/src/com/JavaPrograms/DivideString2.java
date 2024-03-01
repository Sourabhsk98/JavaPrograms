package com.TodaysJavaPrograms;

public class DivideString2 {
    static void divide(String str, int n) {

        if (str.length() % n != 0) {
            System.out.print("Invalid Input: String size");
            System.out.print(" is not divisible by n");
            return;
        }
        int parts = str.length() / n;
        int start = 0;
        int t = parts;
        while (start < str.length()) {
            String temp = new String(str);

            System.out.print(temp.substring(start, parts) + "\n");
            start = parts;
            parts += t;
            // if(start < str.length()) System.out.println(); to ignore
            // final new line
        }
    }
    // Driver code
    public static void main(String[] args) {
        String str = "a_simple_divide_String_quest";
        divide(str, 4);
    }
}
