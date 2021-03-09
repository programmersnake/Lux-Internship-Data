package com.luxoft.junit5.parameterresolver;


import com.luxoft.junit5.predicate.PositiveNumberPredicate;
import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.RepeatedTest.LONG_DISPLAY_NAME;

class RepeatedTestsExample {
    private static final int ZERO = 0;

    private PositiveNumberPredicate predicate = new PositiveNumberPredicate();

    @BeforeEach
    void init(TestReporter testReporter, TestInfo testInfo, RepetitionInfo repetitionInfo) {
        testReporter.publishEntry( "Repetition", aRepetitionDescription( testInfo, repetitionInfo ) );
    }

    private String aRepetitionDescription(TestInfo testInfo, RepetitionInfo repetitionInfo) {
        return testInfo.getTestMethod().get().getName() + ": " + repetitionInfo.getCurrentRepetition() + " of " + repetitionInfo.getTotalRepetitions();
    }

    @RepeatedTest(5)
    void shouldRecognizePositiveNumber(TestReporter testReporter) {
        int number = aRandomPositive();

        assertTrue( predicate.check( number ) );
        testReporter.publishEntry( "Number", String.valueOf( number ) );
    }

//    @Test
//    void shouldRecognizeZeroAsNonPositive() {
//        assertFalse(predicate.check(ZERO));
//    }

    @RepeatedTest(value = 5, name = LONG_DISPLAY_NAME)
    @DisplayName("Should recognize negative numbers.")
    void shouldRecognizeNegativeNumber(TestReporter testReporter) {
        int number = aRandomNegative();

        assertFalse( predicate.check( number ) );
        testReporter.publishEntry( "Number", String.valueOf( number ) );
    }

    private int aRandomNegative() {
        int number = aRandomPositive();
        return number - (2 * number);
    }

    private int aRandomPositive() {
        return (int) (Math.random() * 100);
    }
}
