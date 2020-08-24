package com.codecool.ctci;

public class WordFrequency {
    public int getFrequency(String[] book, String word){
        word = word.trim().toLowerCase();
        int count = 0;
        for (String w : book){
            if (w.trim().toLowerCase().equals(word)){
                count++;
            }
        }
        System.out.println(count);
        return count;
    }
}
