package io.locngo.calculator;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class CalculatorTests {
    private final Calculator calculator = new Calculator();

    @Test
    void testSum() {
        assertEquals(5, calculator.sum(2, 3));
    }
}
