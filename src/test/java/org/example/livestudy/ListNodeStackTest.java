package org.example.livestudy;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class ListNodeStackTest {

    ListNode head = new ListNode(0);
    ListNode first = new ListNode(10);

    @Test
    void push() {
        head.add(first, head, 1);
        assertThat(head.next).isEqualTo(first);
    }

    @Test
    void pop() {
    }
}