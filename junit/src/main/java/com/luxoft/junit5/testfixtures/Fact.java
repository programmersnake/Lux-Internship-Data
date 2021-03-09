package com.luxoft.junit5.testfixtures;

public class Fact {
    static final Fact TRUTH = new Fact( true );
    static final Fact LIE = new Fact( false );

    private final boolean truth;

    private Fact(boolean truth) {
        this.truth = truth;
    }

    public boolean isTruth() {
        return truth;
    }
}
