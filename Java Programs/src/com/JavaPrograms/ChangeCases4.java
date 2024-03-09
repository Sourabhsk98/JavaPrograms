package com.TodaysJavaPrograms;

public class ChangeCases4 {
    public static void main(String[] args)
    {
        String str = "HeLLo wORld";
        String x = "";
        String upperalphabets = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String loweralphabets = "abcdefghijklmnopqrstuvwxyz";
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (upperalphabets.indexOf(ch) != -1) {
                x += loweralphabets.charAt(upperalphabets.indexOf(ch));
            }
            else {
                x += upperalphabets.charAt(loweralphabets.indexOf(ch));
            }
        }
        System.out.println(x);
    }
}
