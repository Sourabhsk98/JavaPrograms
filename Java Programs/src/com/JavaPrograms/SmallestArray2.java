package com.TodaysJavaPrograms;

import java.util.*;
public class SmallestArray2 {
    public static int getSmallest(Integer[] a, int total){
        List<Integer> list=Arrays.asList(a);
        Collections.sort(list);
        int element=list.get(0);
        return element;
    }
    public static void main(String args[]){
        Integer a[]={1,2,5,6,3,2};
        Integer b[]={40,60,90,70,30,20,50};

        System.out.println("Smallest: "+getSmallest(a,6));
        System.out.println("Smallest: "+getSmallest(b,7));
    }
}
