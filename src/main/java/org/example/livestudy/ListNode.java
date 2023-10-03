package org.example.livestudy;

import java.util.List;

public class ListNode {

    private int value; // 데이터 값(정수로 표현)

    ListNode next; // 다음 요소의 주소

    ListNode(int value) {
        this.value = value;
    }

    ListNode add(ListNode head, ListNode nodeToAdd, int position) {
        // head : 추가할 노드 nodeToAdd : 기준 노드
        ListNode current = nodeToAdd;
        while (--position != 0) {
            current = current.next;
        }
        ListNode tmp = current.next;
        current.next = head;
        head.next = tmp;
        return head;
    }

    ListNode remove(ListNode head, int positionToRemove) {


        return head;
    }

    boolean contains(ListNode head, ListNode nodeToCheck) {

        return false;
    }


    public static void main(String[] args) {

        ListNode head = new ListNode(6);
        ListNode nodeB = new ListNode(3);
        ListNode nodeC = new ListNode(4);
        ListNode nodeD = new ListNode(2);
        ListNode nodeE = new ListNode(1);

        head.next = nodeB;
        nodeB.next = nodeC;
        nodeC.next = nodeD;
        nodeD.next = nodeE;

        ListNode nodeF = new ListNode(11);

        head.add(nodeF, head, 1);
        System.out.println(nodeF);
        System.out.println(nodeF.next);
        System.out.println(nodeB);
        System.out.println(head.next);
    }

}

