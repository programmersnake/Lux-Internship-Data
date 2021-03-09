package com.luxoft.junit5.assertion;

import com.luxoft.junit5.domain.assertions.Job;
import com.luxoft.junit5.domain.assertions.SystemUnderTest;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AssertionsWithMessageExample {
    private final SystemUnderTest systemUnderTest = new SystemUnderTest( "Assertions with message" );

    @Test
    void shouldRecognizeWhenTestsStarted() {
        systemUnderTest.examine();

        assertTrue( systemUnderTest.isUnderTest(), "System should be recognized as under tests." );
    }

    @Test
    void shouldRecognizeIfTestsDidNotStarted() {
        assertFalse( systemUnderTest.isUnderTest(), () -> "System should be seen as not under tests." );
    }

    @Test
    void shouldRecognizeTheSameJob() {
        Job job = aSomeJob();
        systemUnderTest.addJob( job );

        systemUnderTest.run();

        assertSame( job, systemUnderTest.getCurrentJob(), () -> "Jobs should be recognized as the same." );
    }

    @Test
    void shouldRecognizeEqualJob() {
        systemUnderTest.addJob( aSomeJob() );

        systemUnderTest.run();

        assertEquals( aSomeJob(), systemUnderTest.getCurrentJob(), () -> "Jobs should be recognized as equal." );
    }

    @Test
    void shouldRecognizeEqualJobs() {
        Job someJob = aSomeJob();
        Job differentJob = aDifferentJob();
        Object[] expectedJobs = {someJob, differentJob};
        systemUnderTest.addJob( someJob );
        systemUnderTest.addJob( differentJob );

        assertArrayEquals( expectedJobs, systemUnderTest.getJobs(),
                () -> "Jobs should be recognized that jobs: \"" + someJob.name() + "\" and \"" + differentJob.name() + "\" are in both collections." );
    }

    @Test
    void shouldRecognizeThatJobsAreEqual() {
        Object[] expectedJobs = {aSomeJob(), aDifferentJob()};
        systemUnderTest.addJob( aSomeJob() );
        systemUnderTest.addJob( aDifferentJob() );

        assertArrayEquals( expectedJobs, systemUnderTest.getJobs(), this::aNotRecognizedEqualJobsMessage );
    }

    private String aNotRecognizedEqualJobsMessage() {
        return "Jobs should be recognized.";
    }

    private Job aDifferentJob() {
        return aJob( "different job" );
    }

    private Job aSomeJob() {
        return aJob( "some job" );
    }

    private Job aJob(String name) {
        return new Job( name );
    }
}
