package com.luxoft.junit5.domain.assertions;

import java.util.ArrayList;
import java.util.List;

public class SystemUnderTest {
    private final String name;
    private final List<Job> jobs = new ArrayList<>();
    private boolean started;
    private Job job;

    public SystemUnderTest(String name) {
        this.name = name;
    }

    public String name() {
        return name;
    }

    public boolean isUnderTest() {
        return started;
    }

    public void examine() {
        started = true;
    }

    public Job getCurrentJob() {
        return job;
    }

    public void addJob(Job job) {
        jobs.add( job );
    }

    public void run() {
        if ( jobs.size() > 0 ) {
            job = jobs.remove( 0 );
            run( job );
        }
    }

    private void run(Job job) {
        job.run();
    }

    public Object[] getJobs() {
        return jobs.toArray();
    }

    @Override
    public boolean equals(Object o) {
        if ( this == o ) return true;
        if ( o == null || getClass() != o.getClass() ) return false;

        SystemUnderTest that = (SystemUnderTest) o;

        return name.equals( that.name );

    }

    @Override
    public int hashCode() {
        return name.hashCode();
    }
}
