package com.luxoft.junit5.tags;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

@Tag("integration")
public class TimeTrackerServiceTest {
    private static final String SOME_NAME = "some fancy name";

    private final TimeTrackerService service = new TimeTrackerService(
            new EpicRepository(), new StoryRepository(), new LdapUserService()
    );

    @Test
    @Tag("slow")
    void shouldFindAllUsers() {
        List<User> users = service.findAllUsers();

        assertTrue( users.isEmpty() );
    }

    @Test
    void shouldNotFindStoryWhenDoesNotExist() {
        boolean result = service.storyExists( SOME_NAME );

        assertFalse( result );
    }

    @Test
    void shouldSaveStory() {
        service.save( new Story( SOME_NAME ) );

        assertTrue( service.storyExists( SOME_NAME ) );
    }

    @Test
    void shouldNotFindEpicWhenDoesNotExist() {
        boolean result = service.epicExists( SOME_NAME );

        assertFalse( result );
    }

    @Test
    void shouldSaveEpic() {
        service.save( new Epic( SOME_NAME ) );

        assertTrue( service.epicExists( SOME_NAME ) );
    }
}
