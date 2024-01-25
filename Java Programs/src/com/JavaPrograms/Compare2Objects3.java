package com.JavaPrograms;

//The equals() method is checking if all the values match or not.
//Comparing two objects with overridden.
class Pet2 {
    // Attributes of objects
    String name;
    int age;
    String breed;

    // Constructor
    Pet2(String name, int age, String breed)
    {
        // Assigning current there it self
        // using this keyword
        this.name = name;
        this.age = age;
        this.breed = breed;
    }

    @Override public boolean equals(Object obj)
    {
        if (this == obj)
            return true;
        if (obj == null
                || this.getClass() != obj.getClass())
            return false;
        Pet2 p1 = (Pet2)obj;

        // Checking only if attribute- name
        // and age is same and ignoring breed
        return this.name.equals(p1.name)
                && this.age == p1.age;
    }
}

public class Compare2Objects3 {

    // Main driver method
    public static void main(String[] args) {

        // Assigning values to attributes of object
        // of class 1
        Pet2 dog1 = new Pet2("Snow", 3, "German Shepherd");
        Pet2 cat1 = new Pet2("Jack", 2, "Tabby");
        Pet2 dog2 = new Pet2("Snow", 3, "German Shepherd");
        Pet2 cat2 = new Pet2("Jack", 2, "Persian");

        // Checking if object are equal and
        // printing boolean output
        System.out.println(cat1.equals(cat2));
    }
}