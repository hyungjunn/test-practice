package org.example.livestudy;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class ListNodeTest {

    ListNode head = new ListNode(6);
    ListNode nodeB = new ListNode(3);
    ListNode nodeC = new ListNode(4);
    ListNode nodeD = new ListNode(2);
    ListNode nodeE = new ListNode(1);

    @BeforeEach
    void setUp() {
        head.next = nodeB;
        nodeB.next = nodeC;
        nodeC.next = nodeD;
        nodeD.next = nodeE;
    }

    @Test
    void add() {

        ListNode nodeF = new ListNode(11);

        head.add(nodeF, head, 1);

        assertThat(nodeB).isEqualTo(nodeF.next);
    }

    @Test
    void add1() {

        ListNode nodeF = new ListNode(11);

        head.add(nodeF, head, 1);

        assertThat(head.next).isEqualTo(nodeF);
    }

    @Test
    void remove() {
    }

    @Test
    void contains() {
    }
}