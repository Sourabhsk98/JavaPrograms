package com.TodaysJavaPrograms;

import java.util.*;
public class SmallestArray1 {
        public static int getSmallest(int[] a, int total){
            Arrays.sort(a);
            return a[0];
        }
        public static void main(String args[]){
            int a[]={1,2,5,6,3,2};
            int b[]={40,60,90,70,30,20,50};
            System.out.println("Smallest: "+getSmallest(a,6));
            System.out.println("Smallest: "+getSmallest(b,7));
        }
}
