package com.luxoft.junit5.testfixtures;

public class HeavyResourceRequiredForAllTests {
    private final String startAnnotation;
    private final String endAnnotation;

    public HeavyResourceRequiredForAllTests(String startAnnotation, String endAnnotation) {
        this.startAnnotation = startAnnotation;
        this.endAnnotation = endAnnotation;
    }

    public void start(Configuration configuration) {
        configuration.read();
        System.out.println( startAnnotation + ": Invoking start() method of " + getClass().getSimpleName() + "." );
    }

    public void close() {
        System.out.println( endAnnotation + ": Invoking close() method of " + getClass().getSimpleName() + "." );
    }
}
