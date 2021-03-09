package com.luxoft.junit5.assumptions;

public class SystemUnderTest {
    private Job currentJob;

    public void run(Job job) {
        currentJob = job;
    }

    public boolean hasJobToRun() {
        return currentJob != null;
    }
}
