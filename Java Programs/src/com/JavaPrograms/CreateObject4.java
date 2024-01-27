package com.JavaPrograms;

// Java Program to Create Object
// Using Deserialization
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.io.Serializable;
class Employee implements Serializable
{
    int empid;
    String empname;
    public void Empoyee(int empid, String empname)
    {
        this.empid = empid;
        this.empname = empname;
    }
}
public class CreateObject4 {
    public static void main(String args[]) {
        try {
//Creating a stream to read the object
            ObjectInputStream in = new ObjectInputStream(new FileInputStream("employee.txt"));
            Employee e = (Employee) in.readObject();
//prints the data of the serialized object
            System.out.println(e.empid + " " + e.empname);
//closing the input stream
            in.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}