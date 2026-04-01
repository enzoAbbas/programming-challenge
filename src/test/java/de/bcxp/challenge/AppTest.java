package de.bcxp.challenge;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotNull;

class AppTest {
    private Operator operator;

    @BeforeEach
    void setUp() {
        operator = new Operator();
    }

    @Test
    void testComputeWeatherOperation() {
        String test = operator.computeWeatherOperation();
        assertNotNull(test, "Results should exist");
        assertFalse(test.isEmpty(), "Results should be within a file");
    }
    @Test
    void testComputeWeatherOperationSuccess() {
        String test = operator.computeWeatherOperation();
        assertNotNull(test, "Results should exist");
        assertEquals("9", test ,"This should be the result");
    }

    @Test
    void testComputeCountryOperation() {
        String test = operator.computeCountryOperation();
        assertNotNull(test, "Results should exist");
        assertFalse(test.isEmpty(), "Results should be within a file");
    }

    @Test
    void testComputeCountryOperationSuccess() {
        String test = operator.computeCountryOperation();
        assertNotNull(test, "Results should exist");
        assertEquals("Malta", test,"This should be the result");
    }
}