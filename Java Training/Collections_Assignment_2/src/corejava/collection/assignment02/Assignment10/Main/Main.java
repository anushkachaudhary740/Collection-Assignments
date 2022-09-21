package corejava.collection.assignment02.Assignment10.Main;

import corejava.collection.assignment02.Assignment10.DoublyLinkedList.DoublyLinkedList;

public class Main {
    public static void main(String[] args)
    {
        DoublyLinkedList dll = new DoublyLinkedList();
        dll.push(6);
        dll.unshift(7);
        dll.unshift(1);
        dll.push(4);
        System.out.println(" Double Linkedlist is: ");
        dll.printlist(dll.head);
        //Delete the node
        dll.shift();
        dll.pop();
        System.out.println("Deleted List");
        dll.printlist(dll.head);
    }
}
