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
    boolean isEmpty() {
        if (count == 0) {
            return true;
        }
        return false;
    }

    void push(int data) {
        // 꽉 차면 집어 넣지 못하고
        if (isFull()) {
            System.out.println("Stack is full");
        }

        // 꽉 안차있다면 집어 넣는다. 그리고 count를 1증가 시킨다.
        if (!isFull()) {
            stackArr[count++] = data;
        }
    }

    int pop() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
        }

        if (!isEmpty()) {
            stackArr[count] = 0;
        }

        return stackArr[count--];
    }

}
