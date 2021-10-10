package com.dll;
class ListNode{
    Person data;
    ListNode next;
    ListNode prev;

    public ListNode(Person data) {
        this.data = data;
    }
}
public class MyDoublyLinkedList {

    int size;
    ListNode head;
    ListNode tail;

    public MyDoublyLinkedList() {
        this.size = 0;
        this.head = new ListNode(null);
        this.tail = new ListNode(null);
        this.head.next = tail;
        this.tail.prev = head;
    }
}
