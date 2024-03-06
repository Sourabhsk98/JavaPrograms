package com.TodaysJavaPrograms;

import java.util.Scanner;

public class StringPermutation5 {
    public static void solve(String curr, String rem) {
        if (rem.length() == 0) {                     //Base condition
            System.out.print(curr + " ");
            return;
        }
        boolean visited[] = new boolean[60]; //Boolean Array
        for (int i = 0; i < rem.length(); i++) {
            char ch = rem.charAt(i);
            String ros = rem.substring(0, i) + rem.substring(i + 1);
            if (visited[ch - 'A'] == false) solve(curr + ch, ros);
            //checking if the character has been already used

            visited[ch - 'A'] = true;
            //character has been marked as visited
        }
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter string to generate its permutations: ");
        String str = scn.next();
        solve("", str);
    }
}
