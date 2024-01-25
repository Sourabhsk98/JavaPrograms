package com.JavaPrograms;

// Checking the hash values using hashCode() before entering the equals()
// Comparisons between two objects need not go through the comparison of every value within them.

// Class 1
class Pet3 {
    // Attributes of objects of class
    String name;
    int age;
    String breed;

    // Constructor
    Pet3(String name, int age, String breed)
    {
        this.name = name;
        this.age = age;
        this.breed = breed;
    }

    // Overriding using hashCode() method
    @Override public int hashCode()
    {
        /* overriding hashCode() method
        to check the length of the names */
        return this.name.length() % 10;
    }

    // Boolean function to check
    @Override public boolean equals(Object obj)
    {
        if (this == obj)
            return true;
        if (obj == null
                || this.getClass() != obj.getClass())
            return false;
        Pet3 p1 = (Pet3)obj;

        return this.name.equals(p1.name)
                && this.age == p1.age && this.breed == p1.breed;
    }
}
// main class (class2)
public class Compare2Objects4 {

    // Main driver method
    public static void main(String[] args)
    {

        // Assigning values to object of class 1(Pet class)
        Pet3 dog1 = new Pet3("Snow", 3, "German Shepherd");
        Pet3 cat1 = new Pet3("Jack", 2, "Persian");
        Pet3 dog2 = new Pet3("Snow", 3, "German Shepherd");
        Pet3 cat2 = new Pet3("Jack", 2, "Persian");

        /* hashCode() generates true as the lengths of
           the name value of the two objects are same*/

        // Condition check using hashCode() method
        if (dog1.hashCode() == cat1.hashCode())

            /* On entering equals() method, it checks for
               other values and hence, returns false */
            System.out.println(dog1.equals(cat1));
        else
            System.out.println("Not equal");
    }
}