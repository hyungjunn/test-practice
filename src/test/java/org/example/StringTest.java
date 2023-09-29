package org.example;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

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
}
