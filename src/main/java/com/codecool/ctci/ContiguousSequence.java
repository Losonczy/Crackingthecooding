package com.codecool.ctci;

public class ContiguousSequence {

    int getMaxSum(int[] numbers) {
        int maxSum = 0;
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
            if (maxSum < sum) {
                maxSum = sum;
            } else if (sum < 0) {
                sum = 0;
            }
        }
        return maxSum;
    }
}
