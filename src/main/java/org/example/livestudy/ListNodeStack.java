package org.example.livestudy;

/**
 * 과제 4. 앞서 만든 ListNode를 사용해서 Stack을 구현하세요.
 * ListNode head를 가지고 있는 ListNodeStack 클래스를 구현하세요.
 * void push(int data)를 구현하세요.
 * int pop()을 구현하세요.
 */
public class ListNodeStack {

    private int stackSize;

    private int count;

    ListNode head;

    private boolean isFull(){
        if (count == stackSize) {
            return true;
        }
        return false;
    }

    void push(int data) {
        // 1. 가득 차있을 때
        if (isFull()) {

        }
        // 2. 가득 차있지 않을 때
    }

    int pop() {
        // 1. 전부 비어 있을 때
        // 2. 전부 비어 있지 않을때
        return 0;
    }

}
