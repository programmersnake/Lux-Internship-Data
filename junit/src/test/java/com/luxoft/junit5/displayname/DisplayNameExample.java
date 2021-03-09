package com.luxoft.junit5.displayname;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

@DisplayName("Example test class which presents @DisplayName annotation.")
class DisplayNameExample {
    private final SystemUnderTest systemUnderTest = new SystemUnderTest();

    @Test
    @DisplayName("System under test should say hello.")
    void shouldReturnHelloWorld() {
        assertEquals( "Hello World", systemUnderTest.hello() );
    }

    @Test
    void shouldReturnTalking() {
        assertEquals( "Talking", systemUnderTest.talk() );
    }

    @Test
    @DisplayName("😱")
    void shouldReturnSeeYouLater() {
        assertEquals( "See you later", systemUnderTest.seeYouLater() );
    }
}
