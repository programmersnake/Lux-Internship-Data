package com.luxoft.junit5.disabled;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

class DisabledTestMethodExample {
    private final SystemUnderTest systemUnderTest = new SystemUnderTest();

    @Test
    @Disabled
    void shouldRecognizeThatSystemUnderTestIsNotRun() {
        assertFalse( systemUnderTest.isRun() );
    }

    @Test
    @Disabled("Somehow I don't like it.")
    void shouldRecognizeThatSystemUnderTestIsRun() {
        systemUnderTest.run( new Job() );

        assertTrue( systemUnderTest.isRun() );
    }
}
