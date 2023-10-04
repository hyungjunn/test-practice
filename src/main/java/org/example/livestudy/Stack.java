package org.example.livestudy;

/**
 * int 배열을 사용해서 정수를 저장하는 Stack을 구현하세요.
 * void push(int data)를 구현하세요.
 * int pop()을 구현하세요.
 */

public class Stack {

    private int count;
    private int stackSize;
    public int stackArr[];

    Stack(int stackSize){
        this.stackSize = stackSize;
        stackArr = new int[this.stackSize];
    }

    boolean isFull() {
        if (count == stackSize) {
            return true;
        }
        return false;
    }
}
