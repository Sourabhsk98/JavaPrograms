package com.JavaPrograms;

// Create a program to create an object using new keyword.

public class CreateObject {
    void show()
    {
        System.out.println("Jai Shree Ram");
    }
    public static void main(String[] args)
    {
//creating an object using new keyword
        CreateObject o = new CreateObject();
//invoking method using the object
        o.show();
    }
}
