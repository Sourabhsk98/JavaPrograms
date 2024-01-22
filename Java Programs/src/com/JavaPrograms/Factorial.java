package com.JavaPrograms;

// Factorial of n is the product of all positive descending integers.
// For example:4! = 4*3*2*1 = 24
// The factorial Program using loop in java.
public class Factorial {
    public static void main(String args[]){
        int i,fact=1;
        int number=5;//It is the number to calculate factorial
        for(i=1;i<=number;i++){
            fact=fact*i;
        }
        System.out.println("Factorial of "+number+" is: "+fact);
    }
}
