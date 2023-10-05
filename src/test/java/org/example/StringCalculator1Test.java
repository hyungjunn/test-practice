package org.example;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

class StringCalculator1Test {

    StringCalculator1 stringCalculator1;

    @ParameterizedTest
    @ValueSource(strings = {" "})
    void 입력한_문자열이_공백인지_확인하는_테스트 (String input) {
        assertTrue(StringCalculator1.isEmpty(input)); // 문자열 같다고 할 땐 equals
    }

    @Test
    void splitInput() {
    }

    @Test
    void toInt() {
    }

    @Test
    void doCalculations() {
    }

    @Test
    void doCalculationsSplitedString() {
    }

    @Test
    void calculate() {
    }
}