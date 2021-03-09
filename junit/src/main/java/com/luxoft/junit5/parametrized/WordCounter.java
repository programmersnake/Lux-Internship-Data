package com.luxoft.junit5.parametrized;

public class WordCounter {
    public int countIn(String sentence) {
        return sentence.split( " " ).length;
    }
}
