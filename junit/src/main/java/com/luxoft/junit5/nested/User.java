package com.luxoft.junit5.nested;

public class User {
    private final String login;
    private final String password;
    private String email;
    private String firstName;
    private String lastName;

    private User(String login, String password) {
        this.login = login;
        this.password = password;
    }

    public String login() {
        return login;
    }

    public String email() {
        return email;
    }

    public String name() {
        return firstName + " " + lastName;
    }

    @Override
    public boolean equals(Object o) {
        if ( this == o ) return true;
        if ( o == null || getClass() != o.getClass() ) return false;

        User user = (User) o;

        return login.equals( user.login ) && password.equals( user.password ) && emailEqualsWith( user ) && nameEqualsWith( user );
    }

    private boolean emailEqualsWith(User user) {
        return email != null ? email.equals( user.email ) : user.email == null;
    }

    private boolean nameEqualsWith(User user) {
        return firstNameEqualsWith( user ) && lastNameEqualsWith( user );
    }

    private boolean firstNameEqualsWith(User user) {
        return firstName != null ? firstName.equals( user.firstName ) : user.firstName == null;
    }

    private boolean lastNameEqualsWith(User user) {
        return lastName != null ? lastName.equals( user.lastName ) : user.lastName == null;
    }

    @Override
    public int hashCode() {
        int result = login.hashCode();
        result = 31 * result + password.hashCode();
        result = 31 * result + (email != null ? email.hashCode() : 0);
        result = 31 * result + (firstName != null ? firstName.hashCode() : 0);
        result = 31 * result + (lastName != null ? lastName.hashCode() : 0);
        return result;
    }

    public static class Builder {
        private final String login;
        private final String password;
        private String email;
        private String firstName;
        private String lastName;

        private Builder(String login, String password) {
            this.login = login;
            this.password = password;
        }

        public static Builder aUser(String login, String password) {
            return new Builder( login, password );
        }

        public Builder withEmail(String email) {
            this.email = email;
            return this;
        }

        public Builder withName(String firstName, String lastName) {
            this.firstName = firstName;
            this.lastName = lastName;
            return this;
        }

        public User build() {
            User user = new User( login, password );
            user.email = email;
            user.firstName = firstName;
            user.lastName = lastName;
            return user;
        }
    }
}
