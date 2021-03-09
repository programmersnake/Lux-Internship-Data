package com.luxoft.junit5.tags;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

@Tag("integration")
public class StoryRepositoryTest {
    private static final String SOME_NAME = "The story of my life";

    private final StoryRepository repository = new StoryRepository();

    @Test
    void shouldNotFindWhenNotExist() {
        boolean result = repository.exists( SOME_NAME );

        assertFalse( result );
    }

    @Test
    void shouldStoreStory() {
        repository.save( new Story( SOME_NAME ) );

        assertTrue( repository.exists( SOME_NAME ) );
    }
}
