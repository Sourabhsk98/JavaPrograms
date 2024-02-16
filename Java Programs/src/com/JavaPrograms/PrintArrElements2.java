package com.TodaysJavaPrograms;

/* Since each element in array contains another array,
just using Arrays.toString() prints the address of the elements (nested array).

To get the numbers from the inner array, we just another function Arrays.deepToString().
This gets us the numbers 1, 2 and so on, we are looking for.
 */
import java.util.Arrays;
public class PrintArrElements2 {
    public static void main(String[] args)
    {
        int[][] array
                = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };

        System.out.println(
                "Values of Multi-Dimensional Array:");
        System.out.println(Arrays.deepToString(array));
    }
}