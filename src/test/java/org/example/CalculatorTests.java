package org.example;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.example.Calculator;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class CalculatorTests {
    Calculator calculator = new Calculator();
    @Test
    @DisplayName("1 + 1 = 2")
    void addsTwoNumbers() {
        assertEquals(2, calculator.add(1, 1), "1 + 1 should equal 2");
    }


    @ParameterizedTest(name = "{0} + {1} = {2}")
    @CsvSource({
            "0,    1,   1",
            "1,    2,   3",
            "49,  51, 100",
            "1,  100, 101"
    })
    void add(int first, int second, int expectedResult) {
        assertEquals(expectedResult, calculator.add(first, second),
                () -> first + " + " + second + " should equal " + expectedResult);
    }
}