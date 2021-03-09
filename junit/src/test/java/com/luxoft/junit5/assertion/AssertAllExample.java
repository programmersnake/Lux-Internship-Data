package com.luxoft.junit5.assertion;

import com.luxoft.junit5.domain.assertions.Job;
import com.luxoft.junit5.domain.assertions.SystemUnderTest;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AssertAllExample {

    @Test
    void shouldRecognizeSutWhichIsNotExamined() {
        SystemUnderTest systemUnderTest = new SystemUnderTest( "AssertAll the things" );

        assertAll( "System Under Test which is not examined",
                () -> assertEquals( "AssertAll the things", systemUnderTest.name() ),
                () -> assertFalse( systemUnderTest.isUnderTest() )
        );
    }

    @Test
    void shouldRecognizeSutWhichIsExamined() {
        SystemUnderTest systemUnderTest = new SystemUnderTest( "AssertAll the things" );

        systemUnderTest.examine();

        assertAll( "System Under Test which is not examined",
                () -> assertEquals( "AssertAll the things", systemUnderTest.name() ),
                () -> assertTrue( systemUnderTest.isUnderTest() )
        );
    }

    @Test
    void shouldRecognizeSutWhichIsRun() {
        SystemUnderTest systemUnderTest = new SystemUnderTest( "AssertAll the things" );
        String jobName = "some job";
        systemUnderTest.addJob( new Job( jobName ) );
        systemUnderTest.addJob( new Job( "yet another" ) );

        systemUnderTest.run();

        assertAll( "System Under Test which is run",
                () -> assertEquals( "AssertAll the things", systemUnderTest.name() ),
                () -> assertEquals( jobName, systemUnderTest.getCurrentJob().name(), () -> "Current job name should be \"" + jobName + "\"." ),
                () -> assertEquals( 1, systemUnderTest.getJobs().length )
        );
    }
}
