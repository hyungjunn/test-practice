package org.example;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class StringCalculator1Test {

    StringCalculator1 stringCalculator1;

    @ParameterizedTest
    @ValueSource(strings = {" "})
    void 입력한_문자열이_공백인지_확인하는_테스트 (String input) {
        assertTrue(StringCalculator1.isEmpty(input)); // 문자열 같다고 할 땐 equals
    }

    @ParameterizedTest
    @ValueSource(strings = {"1 + 2 * 2 / 3"})
    void 문자열_나누기(String input) {
        String[] splitInput = input.split(" ");

        assertThat(splitInput).containsExactly("1","+","2","*","2","/","3");
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