package org.example.livestudy;

/**
 * 과제 4. 앞서 만든 ListNode를 사용해서 Stack을 구현하세요.
 * ListNode head를 가지고 있는 ListNodeStack 클래스를 구현하세요.
 * void push(int data)를 구현하세요.
 * int pop()을 구현하세요.
 */
public class ListNodeStack {

    public ListNode head;

    // 디폴트 값
    public ListNodeStack() {
        this.head = null;
    }

    public void push(int data) {
        ListNode pushNode = new ListNode(data);
        if (head == null) {
            head = new ListNode(data);
        } else {
            head.add(pushNode, head, 1);
        }
    }

    int pop() {
        head.remove(this.head, 1);
        return -1;
    }

}
