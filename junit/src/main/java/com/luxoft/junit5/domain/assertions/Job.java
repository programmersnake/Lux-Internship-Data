package com.luxoft.junit5.domain.assertions;

public class Job {
    private final String name;

    public Job(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if ( this == o ) return true;
        if ( o == null || getClass() != o.getClass() ) return false;

        Job job = (Job) o;

        return name.equals( job.name );

    }

    @Override
    public int hashCode() {
        return name.hashCode();
    }

    public void run() {

    }

    public String name() {
        return name;
    }
}
