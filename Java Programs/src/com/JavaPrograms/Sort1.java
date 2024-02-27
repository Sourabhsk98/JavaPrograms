package com.TodaysJavaPrograms;

public class Sort1 {
    public static void main(String[] args)
    {
//creating an instance of an array
        int[] arr = new int[] {40,60,90,70,30,20,50};
        System.out.println("Array elements after sorting:");
//sorting logic
        for (int i = 0; i < arr.length; i++)
        {
            for (int j = i + 1; j < arr.length; j++)
            {
                int tmp = 0;
                if (arr[i] > arr[j])
                {
                    tmp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = tmp;
                }
            }
//prints the sorted element of the array
            System.out.println(arr[i]);
        }
    }
}
