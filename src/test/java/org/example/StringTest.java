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
}
