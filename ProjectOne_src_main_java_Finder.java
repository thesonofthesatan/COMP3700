// Java code to demonstrate how to
// extract minimumimum and maximumimum aryber
// in 1 line.
import java.util.Arrays;
import java.util.Collections;

public class Finder {
    public static void main(String[] args)
    {

        //Giving an array
        Integer[] ary = { 31, 12, 127, 4 };

        int minimum = Collections.min(Arrays.asList(ary)); // For Minimum

        int maximum = Collections.max(Arrays.asList(ary));// For Maximum

        //minimumimum and maximumimum
        System.out.println("Minimum aryber of array is : " + minimum);
        System.out.println("Maximum aryber of array is : " + maximum);
    }

    static void findMin (int[] ary) {
    }

    static void findMax (int[] ary) {
    }
}
