package com.TodaysJavaPrograms;

public class RightRotate1 {

    // Method 1
    // To right rotate arr[] of size N by D
    void rightRotate(int arr[], int d, int n)
    {
        // If arr is rotated n times then
        // you get the same array
        while (d > n) {
            d = d - n;
        }
        // Creating a temporary array of size d
        int temp[] = new int[n - d];

        // Now copying first N-D element in array temp
        for (int i = 0; i < n - d; i++)
            temp[i] = arr[i];

        // Moving the rest element to index zero to D
        for (int i = n - d; i < n; i++) {
            arr[i - n + d] = arr[i];
        }
        // Copying the temp array element
        // in original array
        for (int i = 0; i < n - d; i++) {
            arr[i + d] = temp[i];
        }
    }
    // Method 2
    // To print an array
    void printArray(int arr[], int n)
    {
        for (int i = 0; i < n; i++)

            // Printing elements of an array
            System.out.print(arr[i] + " ");
    }
    // Method 3
    // Main driver method
    public static void main(String[] args)
    {
        // Creating object of class inside main() method
        RightRotate1 r = new RightRotate1();

        // Custom input array
        int arr[] = { 1, 2, 3, 4, 5 };

        // Calling method1 to rotate array
        r.rightRotate(arr, 2, arr.length);

        // Calling method 2 to print array
        r.printArray(arr, arr.length);
    }
}
