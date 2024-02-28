package com.TodaysJavaPrograms;


import java.util.Scanner;
public class CountCharacter4 {
        public static void main(String[] args){
            String str; //variable declaration
            int count=0;

            Scanner scan=new Scanner(System.in);
            //create a scanner object for input

            System.out.println("Enter the String for count characters  ");
            str=scan.nextLine();

//count each character without space
            for(int i=0; i<str.length(); i++){
                if(str.charAt(i)!=' '){// this condition is used to avoid counting space
                    count++;
                }
            }
//display the total number of characters in te given string
            System.out.print("The total number of character in a string :"+count);
        }
    }
