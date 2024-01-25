package com.JavaPrograms;

// equals() method can be used to compare the values of two strings.
// Java Program to compare two objects without overriding it
// Importing java input output library
class Pet {
    // attributes of class1
    String name;
    int age;
    String breed;

    // constructor of class 1
    Pet(String name, int age, String breed)
    {
        // Assignment of current attributes
        /// using this keyword with same
        this.name = name;
        this.age = age;
        this.breed = breed;
    }
}

/* Class 2 : where execution is shown
             for class 1 */
public class Compare2Objects1 {

    // Main driver method
    public static void main(String[] args)
    {

        // Objects of class1 (auxiliary class)
        // are assigned value */
        Pet Dog1 = new Pet("Snow", 3, "German Shepherd");
        Pet Cat = new Pet("Jack", 2, "Bombay Cat");
        Pet Dog2 = new Pet("Snow", 3, "German Shepherd");

        // Checking objects are equal and
        // printing output- true/false
        System.out.println(Dog2.equals(Dog1));
    }
}