package com.luxoft.junit5.assertion;

import com.luxoft.junit5.domain.assertions.Job;
import com.luxoft.junit5.domain.assertions.SystemUnderTest;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AssertionsExample {
    private final SystemUnderTest systemUnderTest = new SystemUnderTest( "Assertions" );

    @Test
    void shouldRecognizeWhenTestsStarted() {
        systemUnderTest.examine();

        assertTrue( systemUnderTest.isUnderTest() );
    }

    @Test
    void shouldRecognizeIfTestsDidNotStarted() {
        assertFalse( systemUnderTest.isUnderTest() );
    }

    @Test
    void shouldReturnNullInCaseOfNoJob() {
        assertNull( systemUnderTest.getCurrentJob() );
    }

    @Test
    void shouldReturnJobIfThereIsOneRun() {
        systemUnderTest.addJob( aSomeJob() );

        systemUnderTest.run();

        assertNotNull( systemUnderTest.getCurrentJob() );
    }

    @Test
    void shouldRecognizeTheSameJob() {
        Job job = aSomeJob();
        systemUnderTest.addJob( job );

        systemUnderTest.run();

        assertSame( job, systemUnderTest.getCurrentJob() );
    }

    @Test
    void shouldRecognizeNotTheSameJob() {
        systemUnderTest.addJob( aSomeJob() );

        systemUnderTest.run();

        assertNotSame( aSomeJob(), systemUnderTest.getCurrentJob() );
    }

    @Test
    void shouldRecognizeEqualJob() {
        systemUnderTest.addJob( aSomeJob() );

        systemUnderTest.run();

        assertEquals( aSomeJob(), systemUnderTest.getCurrentJob() );
    }

    @Test
    void shouldRecognizeNotEqualJob() {
        systemUnderTest.addJob( aSomeJob() );

        systemUnderTest.run();

        assertNotEquals( aDifferentJob(), systemUnderTest.getCurrentJob() );
    }

    @Test
    void shouldRecognizeEqualJobs() {
        Object[] expectedJobs = {aSomeJob(), aDifferentJob()};
        systemUnderTest.addJob( aSomeJob() );
        systemUnderTest.addJob( aDifferentJob() );

        assertArrayEquals( expectedJobs, systemUnderTest.getJobs() );
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
