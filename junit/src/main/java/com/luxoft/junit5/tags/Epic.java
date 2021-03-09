package com.luxoft.junit5.tags;

public class Epic {
    private final String name;

    Epic(String name) {
        this.name = name;
    }

    public String name() {
        return name;
    }
}
