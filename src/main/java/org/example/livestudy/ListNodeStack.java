package org.example.livestudy;

/**
 * 과제 4. 앞서 만든 ListNode를 사용해서 Stack을 구현하세요.
 * ListNode head를 가지고 있는 ListNodeStack 클래스를 구현하세요.
 * void push(int data)를 구현하세요.
 * int pop()을 구현하세요.
 */
public class ListNodeStack {

    private ListNode head;

    public ListNodeStack(){
        this.head = new ListNode(0);
    }

    void push(int data) {
        ListNode node = new ListNode(data);
        node.add(this.head, node, 1);
    }

    int pop() {
        return 0;
    }

}
