package org.example.livestudy;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class ListNodeStackTest {

    private ListNodeStack stack;
    private static final int[] PUSH_DATA = {10, 20, 30, 40, 50};

    @BeforeEach
    void setUp() {
        stack = new ListNodeStack();
    }

    @Test
    void push() {
        stack.push(10);

        ListNode head = stack.head;

        assertThat(head.value).isEqualTo(PUSH_DATA[0]);
    }

    @Test
    void pop() {
        stack.push(10);
        stack.push(20);
        stack.push(30);

        assertThat(stack.pop()).isEqualTo(30);

    }
}