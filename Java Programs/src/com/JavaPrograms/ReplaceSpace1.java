package com.TodaysJavaPrograms;

public class ReplaceSpace1 {
    public static void main(String[] args)
    {
        String string = "Slow and steady wins the race";
        char ch = '-';
        System.out.println("String before replacing spaces with given character: ");
        System.out.println(string);

        //Replace space with specific character ch
        string = string.replaceAll(" ", "-");
        System.out.println("String after replacing spaces with given character: ");
        System.out.println(string);
    }
}
