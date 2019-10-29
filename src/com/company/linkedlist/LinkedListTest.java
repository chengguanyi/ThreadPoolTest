package com.company.linkedlist;

/**
 * @author chengguanyi
 * @date 2019/10/29 17:13
 */
public class LinkedListTest {

    private Node head = null;
    private int size = 0;

    public class Node {
        private Object data;
        private Node next;

        public Node(Object data) {
            this.data = data;
        }
    }


    /**
     * 链表头增加
     *
     * @param data
     */
    public void addNode(Object data) {
        Node node = new Node(data);
        if (size == 0) {
            head = node;
        } else {
            node.next = head;
            head = node;
        }
        size++;
    }


    /**
     *
     */
    public void show() {
        System.out.print("[");
        Node node = head;
        while (size > 0) {
            System.out.print(node.data);
            if (node.next != null){
                System.out.print("->");
                node = node.next;
            }
            size--;
        }
        System.out.print("]");
    }

    public static void main(String[] args) {
        LinkedListTest test = new LinkedListTest();
        test.addNode("A");
        test.addNode("2");
        test.addNode("f");
        test.addNode("q");
        test.addNode("m");
        test.show();
    }


}
