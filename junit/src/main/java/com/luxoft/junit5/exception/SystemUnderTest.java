package com.luxoft.junit5.exception;

import java.util.ArrayList;
import java.util.List;

public class SystemUnderTest {
    private final List<Job> jobs = new ArrayList<>();

    public void add(Job job) {
        jobs.add( job );
    }

    public Job getFirstJob() {
        if ( jobs.size() > 0 ) {
            return jobs.get( 0 );
        }

        throw new NoJobException( "Jobs list is empty." );
    }
}
