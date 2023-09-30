package org.example;

public class MyLinkedList {
    ListNode tmp = new ListNode();
    // 새로운 요소를 생성한 다음 추가하고자 하는 위치의 이전 요소의 참조를 새로운 요소에 대한 참조로 변경
    // 새로운 요소가 그 다음 요소를 참조하도록 한다
    ListNode add(ListNode head, ListNode nodeToAdd, int position) {
        tmp = head;
        for (int i = 0; i < position; i++) {
            tmp = tmp.next;
        }
        ListNode tmp2 = tmp.next;
        nodeToAdd = new ListNode();
        tmp.next = nodeToAdd;
        nodeToAdd.next = tmp2;
        return nodeToAdd;
    }

    // 삭제하고자 하는 요소의 이전 요소가 삭제하고자 하는 요소의 다음 요소를 참조하도록 한다.
    ListNode remove(ListNode head, int positionToRemove) {
        tmp = head;
        for (int i = 0; i < positionToRemove; i++) {
            tmp = tmp.next;
        }
        ListNode tmp2 = tmp.next;
        tmp.next = tmp.next.next;
        tmp2 = null;
        return null;
    }
    // 포함되었는지 알려준다.
    boolean contains(ListNode head, ListNode nodeToCheck) {
        tmp = head;
        while(tmp.next != null) {
            if (tmp.equals(nodeToCheck)) {
                return true;
            }
            tmp = tmp.next;
        }
        return false;
    }
}
