package org.example.livestudy;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class StackTest {

    Stack stack = new Stack(5);

    @Test
    void push() {

        stack.push(3);
        assertThat(stack.stackArr[0]).isEqualTo(3);

    }

    @Test
    void pop() {

        stack.pop();
        assertThat(stack.stackArr[0]).isEqualTo(0);

    }

    @Test
    void push1() {

        stack.push(1);
        assertThat(stack.stackArr[0]).isEqualTo(1);

    }
}
