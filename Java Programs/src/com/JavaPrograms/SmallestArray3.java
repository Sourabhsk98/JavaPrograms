package com.TodaysJavaPrograms;

public class SmallestArray3 {
    public static void main(String args[])
    {
        int arr[] = {30, 5, 20, 10, 40, 15};
        int min = arr[0];
        for(int i=0; i<arr.length; i++) { if(min > arr[i])
        {
            min = arr[i];
        }
        }
        System.out.println("The minimum element is:" + min);
    }
}
