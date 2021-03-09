package com.luxoft.junit5.assertion;

import com.luxoft.junit5.timeout.Job;
import com.luxoft.junit5.timeout.SystemUnderTest;
import org.junit.jupiter.api.Test;

import static java.lang.Thread.sleep;
import static java.time.Duration.ofMillis;
import static org.junit.jupiter.api.Assertions.*;

class AssertTimeoutExample {
    private final SystemUnderTest systemUnderTest = new SystemUnderTest();

    @Test
    void shouldRecognizeThatJobIsCompleted() throws InterruptedException {
        assertTimeout( ofMillis( 500 ), () -> systemUnderTest.run( aJob() ) );

        assertTrue( systemUnderTest.isCompleted() );
    }

    @Test
    void shouldRecognizeCompletedJob() throws InterruptedException {
        assertTimeoutPreemptively( ofMillis( 500 ), () -> systemUnderTest.run( aJob() ) );

        assertTrue( systemUnderTest.isCompleted() );
    }

    private Job aJob() {
        return () -> sleep( 200 );
    }
}
