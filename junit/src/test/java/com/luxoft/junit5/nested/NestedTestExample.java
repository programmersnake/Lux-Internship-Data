package com.luxoft.junit5.nested;

import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static com.luxoft.junit5.nested.User.Builder.aUser;
import static org.junit.jupiter.api.Assertions.*;

class NestedTestExample {
    private static final String SOME_LOGIN = "user";
    private static final String SOME_PASSWORD = "somePassword";

    @Nested
    class BuilderTest {
        private static final String SOME_EMAIL = "user@luxoft.com";
        private static final String SOME_FIRST_NAME = "User First Name";
        private static final String SOME_LAST_NAME = "User Last Name";
        private static final String SOME_NAME = SOME_FIRST_NAME + " " + SOME_LAST_NAME;

        @Test
        void shouldBuildAUserWithGivenParameters() {
            User user = aUser( SOME_LOGIN, SOME_PASSWORD )
                    .withEmail( SOME_EMAIL )
                    .withName( SOME_FIRST_NAME, SOME_LAST_NAME )
                    .build();

            assertAll( () -> {
                assertEquals( SOME_LOGIN, user.login() );
                assertEquals( SOME_EMAIL, user.email() );
                assertEquals( SOME_NAME, user.name() );
            } );
        }
    }

    @Nested
    class UserEqualToTests {
        private static final String DIFFERENT_LOGIN = "pparker";

        @Test
        void shouldRecognizeDifferUsers() {
            User user = aUser( SOME_LOGIN, SOME_PASSWORD ).build();
            User differentUser = aUser( DIFFERENT_LOGIN, SOME_PASSWORD ).build();

            assertNotEquals( user, differentUser );
        }

        @Test
        void shouldRecognizeSameUser() {
            User user = aUser( SOME_LOGIN, SOME_PASSWORD ).build();
            User sameUser = aUser( SOME_LOGIN, SOME_PASSWORD ).build();

            assertAll( () -> {
                assertEquals( user, sameUser );
                assertNotSame( user, sameUser );
            } );
        }
    }

    @Nested
    class UserHashCodeTests {
        private static final String DIFFERENT_LOGIN = "pparker";

        @Test
        void shouldRecognizeDifferUsers() {
            User user = aUser( SOME_LOGIN, SOME_PASSWORD ).build();
            User differentUser = aUser( DIFFERENT_LOGIN, SOME_PASSWORD ).build();

            assertNotEquals( user.hashCode(), differentUser.hashCode() );
        }

        @Test
        void shouldRecognizeSameUser() {
            User user = aUser( SOME_LOGIN, SOME_PASSWORD ).build();
            User sameUser = aUser( SOME_LOGIN, SOME_PASSWORD ).build();

            assertEquals( user.hashCode(), sameUser.hashCode() );
        }
    }
}
