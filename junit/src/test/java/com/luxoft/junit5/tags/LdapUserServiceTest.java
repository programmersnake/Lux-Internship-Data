package com.luxoft.junit5.tags;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertTrue;

@Tag("integration")
@Tag("slow")
public class LdapUserServiceTest {

    @Test
    void shouldFindAllUsers() {
        List<User> users = new LdapUserService().findAllUsers();

        assertTrue( users.isEmpty() );
    }
}
