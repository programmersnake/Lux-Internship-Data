package com.luxoft.junit5.tags;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

@Tag("unittest")
public class StoryTest {
    private static final String SOME_NAME = "The story of my life";

    @Test
    void shouldCreateStory() {
        Story story = new Story( SOME_NAME );

        assertEquals( SOME_NAME, story.name() );
    }
}
