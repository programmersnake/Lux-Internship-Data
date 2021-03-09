package com.luxoft.junit5.parametrized;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ParameterizedTestCsvSourceExample {
    private WordCounter wordCounter = new WordCounter();

    @ParameterizedTest
    @CsvSource({"2 , Some sentence", "4,Yet another silly sentence", "3, Sentence no more"})
    void shouldCountWordsInSentence(int expected, String sentence) {
        assertEquals( expected, wordCounter.countIn( sentence ) );
    }
}
