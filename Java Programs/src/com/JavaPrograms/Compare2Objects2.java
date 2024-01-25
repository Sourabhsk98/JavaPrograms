package com.JavaPrograms;
import java.io.*;

// Java Program to compare two objects with overriding it
// the values of dog1 and dog2 are the same, equals() method always checks the reference of the two objects
// i.e if both the objects passed refer to the same object or not.
class Pet1 {
    String name;
    int age;
    String breed;
    Pet1(String name, int age, String breed)
    {
        this.name = name;
        this.age = age;
        this.breed = breed;
    }
    @Override public boolean equals(Object obj)
    {
        // checking if the two objects
        // pointing to same object
        if (this == obj)
            return true;

        // checking for two condition:
        // 1) object is pointing to null
        // 2) if the objects belong to
        // same class or not
        if (obj == null
                || this.getClass() != obj.getClass())
            return false;

        Pet1 p1 = (Pet1)obj; // type casting object to the
        // intended class type

        // checking if the two
        // objects share all the same values
        return this.name.equals(p1.name)
                && this.age == p1.age
                && this.breed.equals(p1.breed);
    }
}
public class Compare2Objects2 {
    public static void main(String[] args)
    {

        Pet1 dog1 = new Pet1("Snow", 3, "German Shepherd");
        Pet1 cat = new Pet1("Jack", 2, "Tabby");
        Pet1 dog2 = new Pet1("Snow", 3, "German Shepherd");
        System.out.println(dog1.equals(dog2));
    }
}