package com.TodaysJavaPrograms;

public class EvenPosition2 {
    public static void main(String[] args){
        int num[] = {12, 23, 11, 64, 5, 87, 22, 67, 100};

        // calling the user defined method
        even_elements(num);
    }

    //method body
    public static void even_elements(int []num){
        System.out.println("Even position of elements present in an array are: ");

        //logic implementation
        for (int i = 2; i < num.length; i = i+2){
            System.out.print(num[i]+" ");
        }

    }
}
