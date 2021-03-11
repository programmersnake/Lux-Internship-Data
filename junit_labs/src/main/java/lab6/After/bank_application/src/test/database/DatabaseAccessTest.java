package lab6.After.bank_application.src.test.database;

import lab6.After.bank_application.src.main.database.Credentials;
import lab6.After.bank_application.src.main.database.Database;
import lab6.After.bank_application.src.test.MockitoExtension;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class DatabaseAccessTest {
    @Mock
    private Database database;

    private Credentials credentials = new Credentials( "user", "password" );

    @Test
    void testUserSuccessfulLogin() {
        when( database.login( credentials ) ).thenReturn( true );
        Credentials sameCredentials = new Credentials( "user", "password" );
        assertTrue( database.login( sameCredentials ) );
    }

    @Test
    void testUserFailedLogin() {
        when( database.login( credentials ) ).thenReturn( true );
        Credentials otherCredentials = new Credentials( "user", "password" );
        otherCredentials.setUsername( "otherUser" );
        otherCredentials.setPassword( "otherPassword" );
        assertNotEquals( credentials.getUsername(), otherCredentials.getUsername() );
        assertNotEquals( credentials.getPassword(), otherCredentials.getPassword() );
        assertNotEquals( credentials.hashCode(), otherCredentials.hashCode() );
        assertFalse( database.login( otherCredentials ) );
    }
}
