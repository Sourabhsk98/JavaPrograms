package com.TodaysJavaPrograms;

public class LargestElement4 {
    static int Max(int arr[], int n){
        if(n==1)
            return arr[0];

        return Math.max(arr[n-1], Max(arr, n-1));
    }
    public static void main(String args[])
    {

        int arr[] = {12, 13, 1, 10, 34, 10};
        int n = arr.length;
        System.out.print("Largest Number is:"+Max(arr, n));
    }
}
