package com.TodaysJavaPrograms;

public class ReverseNumber3 {
    public static void main (String[]args)
    {
        //variables initialization
        int num = 1234;

        getReverse (num);
    }

    static void getReverse (int num)
    {
        if (num == 0)
            return;

        int rem = num % 10;
        System.out.print (rem);

        getReverse (num / 10);
    }
}
