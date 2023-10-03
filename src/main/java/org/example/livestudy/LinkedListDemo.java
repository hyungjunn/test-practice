package org.example.livestudy;

public class LinkedListDemo {

    public static void main(String[] args) {

        Node head = new Node(6);
        Node nodeB = new Node(3);
        Node nodeC = new Node(4);
        Node nodeD = new Node(2);
        Node nodeE = new Node(1);

        head.next = nodeB;
        nodeB.next = nodeC;
        nodeC.next = nodeD;
        nodeD.next = nodeE;

        System.out.println(countNodes(head));
        System.out.println(countNodes(nodeB));

    }

    static int countNodes(Node head) {
        int count = 1;
        if (head != null) {
            Node current = head;
            while (current.next != null) {
                current = current.next;
                count++;
            }
        }
        return count;
    }
}
