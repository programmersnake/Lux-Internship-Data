package com.luxoft.junit5.testfixtures;

import static com.luxoft.junit5.testfixtures.Fact.LIE;
import static com.luxoft.junit5.testfixtures.Fact.TRUTH;

public class SystemUnderTest {
    public Fact returnTheTruth() {
        System.out.println( "@Test: getting the truth from " + getClass().getSimpleName() + "." );
        return TRUTH;
    }

    public Fact returnTheLie() {
        System.out.println( "@Test: getting the lie from " + getClass().getSimpleName() + "." );
        return LIE;
    }
}
