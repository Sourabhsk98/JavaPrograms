package com.JavaPrograms;

// Create Object Using clone() Method
public class CreateObject3 implements Cloneable{
    @Override
    protected Object clone() throws CloneNotSupportedException
    {
//invokes the clone() method of the super class
        return super.clone();
    }
    String str = "New Object Created";
    public static void main(String[] args)
    {
//creating an object of the class
        CreateObject3 obj1 = new CreateObject3();
//try catch block to catch the exception thrown by the method
        try
        {
//creating a new object of the obj1 suing the clone() method
            CreateObject3 obj2 = (CreateObject3) obj1.clone();
            System.out.println(obj2.str);
        }
        catch (CloneNotSupportedException e)
        {
            e.printStackTrace();
        }
    }
}