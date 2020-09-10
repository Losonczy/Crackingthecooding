package com.codecool.ctci;

public class MajorityElement {

    int findMajorityElement(int[] array){
        for(int x : array){
            if (validate(array,x)){
                return x;
            }
        }
        return -1;
    }

    boolean validate(int[] array, int majority){
        int count = 0 ;
        for (int n : array){
            if (n == majority){
                count++;
            }
        }
        return count > array.length/2;
    }
}
