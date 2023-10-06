package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.assertj.core.api.Assertions.assertThat;
import static org.example.StringCalculator1.splitInput;
import static org.example.StringCalculator1.toInt;
import static org.junit.jupiter.api.Assertions.*;

class StringCalculator1Test {

    StringCalculator1 stringCalculator1;

    @BeforeEach
    void setUp(){
        stringCalculator1 = new StringCalculator1();
    }

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
    void 문자열을_숫자로_바꿔주는_메서드() {
        String string = "123";
        Assertions.assertEquals(toInt(string), 123);
    }

    @Test
    void doCalculations() {

    }

    @Test
    void doCalculationsSplitedString() {
        String[] strings = {"1", "+", "1", "-", "1"};
        Assertions.assertEquals(stringCalculator1.doCalculationsSplitedString(strings), 1);
    }

    @Test
    void calculate() {
    }

    @Test
    void 최종결과확인(){
        StringCalculator1 stringCalculator1 = new StringCalculator1();
        stringCalculator1.doCalculations(stringCalculator1.input());
    }
}