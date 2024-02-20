package com.TodaysJavaPrograms;

public class SmallestElement3 {
    static int getmin(int arr[], int n){
        if(n==1)
            return arr[0];

        return Math.min(arr[n-1], getmin(arr, n-1));
    }
    public static void main(String args[])
    {

        int arr[] = {12, 13, 1, 10, 34, 10};
        int n = arr.length;
        System.out.print(getmin(arr, n));
    }
}
