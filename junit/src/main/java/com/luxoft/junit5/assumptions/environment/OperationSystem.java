package com.luxoft.junit5.assumptions.environment;

public class OperationSystem {
    private final String name;
    private final String architecture;

    public OperationSystem(String name, String architecture) {
        this.name = name;
        this.architecture = architecture;
    }

    public String name() {
        return name;
    }

    public String architecture() {
        return architecture;
    }
}
