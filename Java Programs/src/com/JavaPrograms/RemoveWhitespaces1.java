package com.TodaysJavaPrograms;

public class RemoveWhitespaces1 {
    public static void main(String[] args)
    {
        String str = "    Hello   World . . . .   !";
        String op = "";

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            // Checking whether is white space or not
            if (!Character.isWhitespace(ch)) {
                op += ch;
            }
        }
        System.out.println(op);
    }
}
