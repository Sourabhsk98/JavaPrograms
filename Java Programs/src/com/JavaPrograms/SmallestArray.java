package com.TodaysJavaPrograms;

public class SmallestArray {
    public static int getSmallest(int[] a, int total){
        int temp;
        for (int i = 0; i < total; i++)
        {
            for (int j = i + 1; j < total; j++)
            {
                if (a[i] > a[j])
                {
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
        return a[0];
    }
    public static void main(String[] args){
        int a[]={1,2,5,6,3,2};
        int b[]={40,60,90,70,30,20,50};
        System.out.println("Smallest: "+getSmallest(a,6));
        System.out.println("Smallest: "+getSmallest(b,7));
    }
}
