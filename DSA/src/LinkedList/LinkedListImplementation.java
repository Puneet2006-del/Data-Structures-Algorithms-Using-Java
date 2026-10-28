package LinkedList;

import java.util.LinkedList;

public class LinkedListImplementation {
    public static void main(String[] args) {
//        Node n1 = new Node();
//        Node n2 =  new Node();
//        n1.value = 1;
//        n2.value = 2;
//        n1.next = n2;
//        n2.next = null;
//        System.out.println(n1.value);
//        System.out.println(n2.value);

        // Doubly Linked List
        // Use Inbuilt classes
        LinkedList<Integer> value = new LinkedList<>();
        value.add(5);
        value.add(10);
        System.out.println(value);
    }
}


// Singly Linked List

class Node{
    public int value; // value inside a node.
    public Node next; // Storing the reference of next node.
}

