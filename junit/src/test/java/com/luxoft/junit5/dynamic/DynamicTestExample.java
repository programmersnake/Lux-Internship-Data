package com.luxoft.junit5.dynamic;

import com.luxoft.junit5.predicate.PositiveNumberPredicate;
import org.junit.jupiter.api.DynamicTest;
import org.junit.jupiter.api.TestFactory;

import java.util.Iterator;

import static java.util.Arrays.asList;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.DynamicTest.dynamicTest;

class DynamicTestExample {
    private PositiveNumberPredicate predicate = new PositiveNumberPredicate();

    @TestFactory
    Iterator<DynamicTest> positiveNumberPredicateTestCases() {
        return asList(
                dynamicTest( "negative number", () -> assertFalse( predicate.check( -1 ) ) ),
                dynamicTest( "zero", () -> assertFalse( predicate.check( 0 ) ) ),
                dynamicTest( "positive number", () -> assertTrue( predicate.check( 1 ) ) )
        ).iterator();
    }
}
