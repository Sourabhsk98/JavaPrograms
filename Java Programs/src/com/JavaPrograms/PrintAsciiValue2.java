package com.JavaPrograms;

// program to prints the ASCII value from range of (0 to 255) of all the characters.
public class PrintAsciiValue2 {
    public static void main(String[] args)
    {
        for(int i = 48; i <= 122; i++)
        {
            System.out.println(" The ASCII value of " + (char)i + "  =  " + i);
        }
    }
}
