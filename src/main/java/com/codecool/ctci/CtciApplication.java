package com.codecool.ctci;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import com.codecool.ctci.SumSwap;
@SpringBootApplication
public class CtciApplication {

    public static void main(String[] args) {
        SpringApplication.run(CtciApplication.class, args);
//        SumSwap sumSwap = new SumSwap();
//        int[] array1 = {4,1,2,1,1,2};
//        int[] array2 = {3,6,3,3,};
//        sumSwap.findSwapValues(array1,array2);

        WordFrequency wordFrequency = new WordFrequency();
        String[] book = {"there is a lot of word in this word array to test my word frequency"};
        String word = "is";
        wordFrequency.getFrequency(book, word);
    }

}
