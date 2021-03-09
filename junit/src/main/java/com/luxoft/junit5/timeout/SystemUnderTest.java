package com.luxoft.junit5.timeout;

public class SystemUnderTest {
    private boolean completed;

    public void run(Job job) throws InterruptedException {
        job.execute();
        completed = true;
    }

    public boolean isCompleted() {
        return completed;
    }
}
