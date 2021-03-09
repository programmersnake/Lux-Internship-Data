package com.luxoft.junit5.parametrized;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.EnumSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ParameterizedTestEnumSourceExample {
    private WordCounter wordCounter = new WordCounter();

    @ParameterizedTest
    @EnumSource(Sentences.class)
    void shouldCountWordsInSentence(Sentences sentence) {
        assertEquals( 3, wordCounter.countIn( sentence.value() ) );
    }

    enum Sentences {
        SINGLE_PARAMETER_EXAMPLE( "Single parameter example" ),
        JUNIT_IN_ACTION( "JUnit in action" );

        private final String sentence;

        Sentences(String sentence) {
            this.sentence = sentence;
        }

        public String value() {
            return sentence;
        }
    }
}
