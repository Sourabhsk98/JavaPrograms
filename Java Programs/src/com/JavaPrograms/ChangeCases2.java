package com.TodaysJavaPrograms;

public class ChangeCases2 {
    static char[] S = "HeLLo wORld".toCharArray();

    // Function to toggle characters
    static void toggleChars()
    {
        for (int i = 0; i < S.length; i++) {
            if (Character.isAlphabetic(S[i])) {
                S[i] ^= (1 << 5);
            }
        }
    }

    // Driver code
    public static void main(String[] args)
    {
        toggleChars();
        System.out.print("String after toggle " + "\n");
        System.out.print(String.valueOf(S));
    }
}
