package com.luxoft.junit5.tags;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

@Tag("unittest")
public class EpicTest {
    private static final String SOME_NAME = "Yet another epic";

    @Test
    void shouldCreateEpic() {
        Epic epic = new Epic( SOME_NAME );

        assertEquals( SOME_NAME, epic.name() );
    }
}
