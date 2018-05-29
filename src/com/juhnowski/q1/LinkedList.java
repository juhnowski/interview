package com.juhnowski.q1;

public class LinkedList {
    Node head; // голова списка

    /**
     * Нода
     */
    class Node
    {
        int data;
        Node next;
        Node(int d) {data = d; next = null; }
    }

    /**
     * Метод вставки элемента в сортированный список
     * @param new_node нода
     */
    void sortedInsert(Node new_node)
    {
        Node current;
        /* Особый случай, Special case for head node */
        if (head == null || head.data >= new_node.data)
        {
            new_node.next = head;
            head = new_node;
        }
        else {
            /* Locate the node before point of insertion. */
            current = head;
            while (current.next != null &&
                    current.next.data < new_node.data)
                current = current.next;
            new_node.next = current.next;
            current.next = new_node;
        }
    }
    /*Утилиты*/
    /* Создать ноду */
    Node newNode(int data)
    {
        Node x = new Node(data);
        return x;
    }
    /* функция печати */
    void printList()
    {
        Node temp = head;
        while (temp != null)
        {
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
    }

    /**
     * Тестируем
     */
    public static void main(String args[])
    {
        LinkedList llist = new LinkedList();
        Node new_node;
        new_node = llist.newNode(5);
        llist.sortedInsert(new_node);
        new_node = llist.newNode(10);
        llist.sortedInsert(new_node);
        new_node = llist.newNode(7);
        llist.sortedInsert(new_node);
        new_node = llist.newNode(3);
        llist.sortedInsert(new_node);
        new_node = llist.newNode(1);
        llist.sortedInsert(new_node);
        new_node = llist.newNode(9);
        llist.sortedInsert(new_node);
        System.out.println("Created Linked List");
        llist.printList();
    }
}