package com.JavaPrograms;

import java.util.Random;

public class RandomNumber2 {
    public static void main (String[] args) {
        Random rand = new Random();
        int max=100,min=50;
        System.out.println("Generated numbers are within "+min+" to "+max);
        System.out.println(rand.nextInt(max - min + 1) + min);
        System.out.println(rand.nextInt(max - min + 1) + min);
        System.out.println(rand.nextInt(max - min + 1) + min);
    }
}