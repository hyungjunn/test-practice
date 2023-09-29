package org.example;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

public class StringTest {
    @Test
    @DisplayName("replace 학습테스트")
    void replace() {
        String actual = "velog".replace("v", "b");
        assertThat(actual).isEqualTo("belog");
    }

    @Test
    @DisplayName("split 학습테스트")
    void split() {
        String[] actual = "1,2".split(",");
        assertThat(actual).containsExactly("1", "2");

        String[] value = "1".split(",");
        assertThat(value).contains("1");
    }

    @Test
    @DisplayName("concat 학습테스트")
    void concat() {
        String value1 = "123";
        String value2 = value1.concat("456");
        assertThat(value2).isEqualTo("123456");
    }

    @Test
    @DisplayName("indexof 학습테스트")
    void indexOf() {
        String name = "제임스고슬링";

        int index1 = name.indexOf("임");
        assertThat(index1).isEqualTo(1);

        int index2 = name.indexOf("고");
        assertThat(index2).isEqualTo(3);
    }

    @Test
    @DisplayName("substring 학습테스트")
    void substring() {
        String str0 = "(1,2)";
        String str1 = str0.substring(1, 4);
        assertThat(str1).isEqualTo("1,2");

        String str2 = "리눅스토발즈";
        String str3 = str2.substring(4);
        assertThat(str3).isEqualTo("발즈");
    }

    @Test
    @DisplayName("valueOf 학습테스트")
    void valueOf() {
        int i = 1000;
        String string = String.valueOf(i);
        assertThat(string).isEqualTo("1000");
    }

    @Test
    @DisplayName("Exception assertion 학습테스트")
    void charAtTestException() {
        String abc = "abc";
        int index = 100;
        assertThatThrownBy(() -> {
            abc.charAt(index);
        })
                .isInstanceOf(StringIndexOutOfBoundsException.class)
                .hasMessageContaining("String index out of range: %d", index);
    }

    @Test
    @DisplayName("Exception assertion 학습테스트2")
    void charAtTestException2() {
        String abc = "abc";
        int index = 4;
        assertThatExceptionOfType(StringIndexOutOfBoundsException.class)
                .isThrownBy(() -> {abc.charAt(index);})
                .withMessageMatching("String index out of range: 4");
    }
}
