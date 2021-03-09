package com.luxoft.junit5.disabled;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

@Disabled
class DisabledTestClassExample {
    private SystemUnderTest systemUnderTest = new SystemUnderTest();

    @Test
    void shouldRecognizeThatSystemUnderTestIsNotRun() {
        assertFalse( systemUnderTest.isRun() );
    }

    @Test
    void shouldRecognizeThatSystemUnderTestIsRun() {
        systemUnderTest.run( new Job() );

        assertTrue( systemUnderTest.isRun() );
    }
}
