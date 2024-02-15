package com.TodaysJavaPrograms;

public class LeftShift3 {
    static void leftRotate(int arr[], int d, int n){
        for (int i = 0; i < d; i++)
            leftRotatebyOne(arr, n);
    }

    static void leftRotatebyOne(int arr[], int n){
        int i, temp;
        temp = arr[0];
        for (i = 0; i < n - 1; i++)
            arr[i] = arr[i + 1];
        arr[n-1] = temp;
    }
    public static void main(String[] args)
    {

        int arr[] = { 10, 20, 30, 40, 50, 60, 70 };

        leftRotate(arr, 3, 7);

        for (int i = 0; i < 7; i++)
            System.out.print(arr[i] + " ");
    }
}