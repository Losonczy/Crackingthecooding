package com.codecool.ctci;
import java.lang.*;
import java.util.Arrays;

public class SumSwap {
    public int[] findSwapValues(int[] array1, int[] array2){
        int sumOfArray1 = 0;
        int sumOfArray2 = 0;

        for (int j : array1) {
            sumOfArray1 += j;
        }
        for (int j : array2) {
            sumOfArray2 += j;
        }


        for (int one : array1) {
            for (int two : array2){
                int newSum1 = sumOfArray1 - one + two;
                int newSum2 = sumOfArray2 - two + one;
                if(newSum2 == newSum1) {
                    int[] values = {one,two};
                    System.out.println(Arrays.toString(values));
                    return values;

                }
            }
        }
        return null;

    }
}
