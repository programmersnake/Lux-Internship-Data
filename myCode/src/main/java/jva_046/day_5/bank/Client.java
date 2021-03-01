package jva_046.day_5.bank;

import java.util.ArrayList;
import java.util.List;

public class Client {

    private String name;
    private Gender gender;
    private String genderRepresentation;
    private List<Account> accounts = new ArrayList<>();

    public Client(String name, Gender gender) {
        this.name = name;
        this.gender = gender;

        if ( this.gender.equals( Gender.MALE ) )
            genderRepresentation = "Mr. ";
        else
            genderRepresentation = "Ms. ";
    }

    public void getClientGreeting() {
        System.out.println( genderRepresentation + getName() );
    }

    public void addAccount(Account newAccount) {
        accounts.add( newAccount );
    }

    public String getName() {
        return name;
    }

    public List<Account> getAccounts() {
        return accounts;
    }

    public Gender getGender() {
        return gender;
    }

    public enum Gender {
        MALE, FEMALE;
    }
}
