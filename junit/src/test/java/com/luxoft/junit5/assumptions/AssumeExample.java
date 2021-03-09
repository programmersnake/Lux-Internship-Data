package com.luxoft.junit5.assumptions;

import com.luxoft.junit5.assumptions.environment.JavaSpecification;
import com.luxoft.junit5.assumptions.environment.OperationSystem;
import com.luxoft.junit5.assumptions.environment.TestsEnvironment;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assumptions.assumeTrue;
import static org.junit.jupiter.api.Assumptions.assumingThat;

class AssumeExample {
    private static final String EXPECTED_JAVA_VERSION = "1.8";
    private final TestsEnvironment environment = new TestsEnvironment(
            new JavaSpecification( System.getProperty( "java.vm.specification.version" ) ),
            new OperationSystem( System.getProperty( "os.name" ), System.getProperty( "os.arch" ) )
    );

    private final SystemUnderTest systemUnderTest = new SystemUnderTest();

    @BeforeEach
    void init() {
        assumeTrue( environment.isWindows() );
    }

    @Test
    void shouldRecognizeThatHasNoJobToRun() {
        assumingThat(
                () -> environment.aJavaVersion().equals( EXPECTED_JAVA_VERSION ),
                () -> assertFalse( systemUnderTest.hasJobToRun() ) );
    }

    @Test
    void shouldRecognizeThatHasJobToRun() {
        assumeTrue( environment.isAmd64Architecture() );

        systemUnderTest.run( new Job() );

        assertTrue( systemUnderTest.hasJobToRun() );
    }
}
