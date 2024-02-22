package com.TodaysJavaPrograms;

public class LeftRotate {
    void LeftRotate(int arr[], int d, int n)
    {
        // Creating temp array of size d
        int temp[] = new int[d];

        // Copying first d element in array temp
        for (int i = 0; i < d; i++)
            temp[i] = arr[i];

        // Moving the rest element to index
        // zero to N-d
        for (int i = d; i < n; i++) {
            arr[i - d] = arr[i];
        }
        // Copying the temp array element
        // in original array
        for (int i = 0; i < d; i++) {
            arr[i + n - d] = temp[i];
        }
    }
    // Method 2
    // To print an array
    void printArray(int arr[], int n)
    {
        for (int i = 0; i < n; i++)
            System.out.print(arr[i] + " ");
    }
    // Method 3
    // Main driver method
    public static void main(String[] args)
    {
        // Creating an object of class inside main()
        LeftRotate r = new LeftRotate();

        // Custom input array
        int arr[] = { 1, 2, 3, 4, 5 };

        // Calling method 1 and 2 as defined above
        r.LeftRotate(arr, 2, arr.length);
        r.printArray(arr, arr.length);
    }
}
