package com.JavaPrograms;

//  Factorial program in java using recursion.
public class Factorial1 {
    static int fact(int n){
        if (n == 0)
            return 1;
        else
            return(n * fact(n-1));
    }
    public static void main(String[] args){
        int i,f=1;
        int number=5;//It is the number to calculate factorial
        f = fact(number);
        System.out.println("Factorial of "+number+" is: "+f);
    }
}