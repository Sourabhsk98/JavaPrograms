package com.JavaPrograms;

// A palindrome number is a number that is same after reverse. Eg: 121,545,..
// Check whether number is palindrome or not.
public class PalindromeNumber {
    public static void main(String[] args){
        int r,sum=0,temp;
        int n=1331;//It is the number variable to be checked for palindrome

        temp=n;
        while(n>0){
            r=n%10;  //getting remainder
            sum=(sum*10)+r;
            n=n/10;
        }
        if(temp==sum)
            System.out.println("Palindrome number ");
        else
            System.out.println("Not palindrome");
    }
}