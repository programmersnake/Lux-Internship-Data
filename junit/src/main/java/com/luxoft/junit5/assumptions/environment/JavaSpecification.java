package com.luxoft.junit5.assumptions.environment;

public class JavaSpecification {
    private final String version;

    public JavaSpecification(String version) {
        this.version = version;
    }

    String version() {
        return version;
    }
}
