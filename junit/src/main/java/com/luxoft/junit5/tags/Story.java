package com.luxoft.junit5.tags;

public class Story {
    private final String name;

    Story(String name) {
        this.name = name;
    }

    public String name() {
        return name;
    }
}
