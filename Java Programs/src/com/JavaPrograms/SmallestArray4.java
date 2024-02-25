package com.TodaysJavaPrograms;

public class SmallestArray4 {
    static int getmin(int arr[], int n){
    if(n==1)
        return arr[0];
    return Math.min(arr[n-1], getmin(arr, n-1));
}
    public static void main(String args[])
    {
        int arr[] = {30, 5, 20, 10, 40, 15};
        int n = arr.length;
        System.out.print("Smallest Array Element is:" + getmin(arr, n));
    }

}
