package com.TodaysJavaPrograms;

public class ChangeCases3 {
    public static void main(String[] args)
    {
        String str = "HeLLo wORld";
        String x = "";
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (Character.isUpperCase(ch)) {
                x += Character.toLowerCase(ch);
                }
            else
                x += Character.toUpperCase(ch);
        }
        System.out.println(x);
    }
}
