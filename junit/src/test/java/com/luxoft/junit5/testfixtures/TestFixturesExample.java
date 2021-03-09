package com.luxoft.junit5.testfixtures;

import org.junit.jupiter.api.*;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

class TestFixturesExample {
    private static HeavyResourceRequiredForAllTests heavyResource;
    private TestSetup testSetup;
    private SystemUnderTest systemUnderTest;

    @BeforeAll
    static void willBeDoneBeforeAllTests() {
        System.out.println( "@BeforeAll" );
        heavyResource = new HeavyResourceRequiredForAllTests( "@BeforeAll", "@AfterAll" );
        heavyResource.start( new DummyConfiguration() );
    }

    @AfterAll
    static void willBeDoneAfterAllTests() {
        heavyResource.close();
    }

    @BeforeEach
    void willBeDoneBeforeEachTest() {
        testSetup = new TestSetup( "@BeforeEach", "@AfterEach" );
        testSetup.prepare();
        systemUnderTest = new SystemUnderTest();
    }

    @AfterEach
    void willBeDoneAfterEachTest() {
        testSetup.cleanUp();
    }

    @Test
    void shouldReturnTheTruth() {
        Fact result = systemUnderTest.returnTheTruth();

        assertTrue( result.isTruth() );
    }

    @Test
    void shouldReturnTheLie() {
        Fact result = systemUnderTest.returnTheLie();

        assertFalse( result.isTruth() );
    }
}
