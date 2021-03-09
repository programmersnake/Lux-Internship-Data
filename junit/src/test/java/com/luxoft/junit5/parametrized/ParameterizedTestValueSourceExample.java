package com.luxoft.junit5.parametrized;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ParameterizedTestValueSourceExample {
    private WordCounter wordCounter = new WordCounter();

    @ParameterizedTest
    @ValueSource(strings = {"Single parameter example", "JUnit in action"})
    void shouldCountWordsInSentence(String sentence) {
        assertEquals( 3, wordCounter.countIn( sentence ) );
    }
}
