package com.luxoft.junit5.tags;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;


@Tag("integration")
public class EpicRepositoryTest {
    private static final String SOME_NAME = "Yet another epic";

    private final EpicRepository repository = new EpicRepository();

    @Test
    void shouldNotFindWhenNotExist() {
        boolean result = repository.exists( SOME_NAME );

        assertFalse( result );
    }

    @Test
    void shouldStoreEpic() {
        repository.save( new Epic( SOME_NAME ) );

        assertTrue( repository.exists( SOME_NAME ) );
    }
}
