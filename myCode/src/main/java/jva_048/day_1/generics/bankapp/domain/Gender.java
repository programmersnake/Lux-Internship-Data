package jva_048.day_1.generics.bankapp.domain;

public enum Gender {

    MALE( "Mr." ), FEMALE( "Ms." );

    private String greeting;

    private Gender(String greeting) {
        this.greeting = greeting;
    }

    public String getGreeting() {
        return greeting;
    }

}
