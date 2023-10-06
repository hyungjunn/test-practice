package org.example.livestudy;

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
        return head.remove(this.head, 1).value;
    }

}
