package com.TodaysJavaPrograms;

public class DivideString4 {
    public static void main(String[] args) {
        String str = "TextOneTextTwo";

        //Finds the length of the given string
        int len = str.length();

        //n represents the number of equal parts. Here 2
        //means the given string will be divided in two equal parts
        int n = 2;

        //numberOfChar represents the number of chars in divided strings
        int temp = 0, numberOfChar = len/n;
        String[] strParts = new String [n];
        //Checking whether the string can be divided in equal parts or not
        if(len % n != 0) {
            System.out.println("String cannot be divided into "+ n +" equal parts.");
        }
        else {
            for(int i = 0; i < len; i = i+numberOfChar) {
                //Dividing string using substring() method
                String subStr = str.substring(i, i+numberOfChar);
                strParts[temp] = subStr;
                temp++;
            }
            System.out.println(n + " equal parts of the given String are: ");
            for(int i = 0; i < strParts.length; i++) {
                System.out.println(strParts[i]);
            }
        }
    }
}
