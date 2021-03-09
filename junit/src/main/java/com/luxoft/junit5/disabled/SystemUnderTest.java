package com.luxoft.junit5.disabled;

public class SystemUnderTest {
    private Job job;

    public boolean isRun() {
        return job != null;
    }

    public void run(Job job) {
        this.job = job;
    }
}
