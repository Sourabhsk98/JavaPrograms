package com.JavaPrograms;

// In this program, No need of package.
public class RandomNumber3 {
    public static void main (String[] args) {
        int max=100,min=50;
        System.out.println("Generated numbers are within "+min+" to "+max);
        System.out.println(min + (int)(Math.random() * ((max - min) + 1)));
        System.out.println(min + (int)(Math.random() * ((max - min) + 1)));
        System.out.println(min + (int)(Math.random() * ((max - min) + 1)));
    }
}
