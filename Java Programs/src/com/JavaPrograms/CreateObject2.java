package com.JavaPrograms;

public class CreateObject2 {
    public String name;

    // Default or no-arg constructor
    CreateObject2() {
        name = "Ayush";
    }
    public static void main(String[] args) {
        try {
            // Load the required class
            Class c = Class.forName("ObjectCreated");

            // Create an instance of the class loaded using newInstance() method
            CreateObject2 s = (CreateObject2) c.newInstance();
            System.out.println(s.name);

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}