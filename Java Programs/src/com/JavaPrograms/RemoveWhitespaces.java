package com.TodaysJavaPrograms;

public class RemoveWhitespaces {
    public static void main(String[] args) {

        String str ="    Hello   World . . . .   !";

        //Removes the white spaces using regex
        str = str.replaceAll("\\s", "");

        System.out.println("String after removing all the white spaces : " + str);
    }
}
