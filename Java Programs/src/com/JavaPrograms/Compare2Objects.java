package com.JavaPrograms;

// Java Program to compare two objects.

public class Compare2Objects {
    public static void main(String[] args)
    {
//creating constructor of the Double class
        Integer x = new Integer(120);
//creating constructor of the Long class
        Float y = new Float(120.46);
//invoking the equals() method
        System.out.println("Objects are not equal, hence it returns " + x.equals(y));
        System.out.println("Objects are equal, hence it returns " + x.equals(120));
    }
}