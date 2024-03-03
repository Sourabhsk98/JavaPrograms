package com.TodaysJavaPrograms;

public class StringSubset4 {
    public static void main(String[] args) {

        String str = "TEXT";
        //finding length of the given string
        int numberOfChar = str.length();
        int temp = 0;
        //If number of characters in a string is n then the
        //possible subsets of that string is n*(n+1)/2
        String subsetArray[] = new String[numberOfChar*(numberOfChar+1)/2];

        for(int i = 0; i < numberOfChar; i++) {
            for(int j = i; j < numberOfChar; j++) {
                subsetArray[temp] = str.substring(i, j+1);
                temp++;
            }
        }

        //Print all the subsets of the given string
        System.out.println("All the possible subsets of the given string: ");
        for(int i = 0; i < subsetArray.length; i++) {
            System.out.println(subsetArray[i]);
        }
    }
}
