package lab6.After.bank_application.src.main.database;


import java.util.HashMap;
import java.util.Map;

public class Database {

    private Map<String, String> registeredUsers = new HashMap<>();

    public boolean login(Credentials credentials) {
        String username = credentials.getUsername();
        String password = credentials.getPassword();

        return registeredUsers.keySet().contains( username ) &&
                registeredUsers.get( username ).equals( password );
    }
}
