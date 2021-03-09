package com.luxoft.junit5.testfixtures;

public class TestSetup {
    private final String startAnnotation;
    private final String endAnnotation;

    public TestSetup(String startAnnotation, String endAnnotation) {
        this.startAnnotation = startAnnotation;
        this.endAnnotation = endAnnotation;
    }

    public void prepare() {
        System.out.println( startAnnotation + ": Invoking prepare() method of " + getClass().getSimpleName() + "." );
    }

    public void cleanUp() {
        System.out.println( endAnnotation + ": Invoking cleanUp() method of " + getClass().getSimpleName() + "." );
    }
}
