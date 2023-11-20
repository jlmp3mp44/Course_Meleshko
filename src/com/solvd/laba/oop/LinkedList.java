package com.solvd.laba.oop;

public class LinkedList <T> {
    Node<T> head;
    static class Node <T>{
        T data;
        Node<T> next;
        Node(T data){
            this.data =  data;
            this.next =  null;
        }
    }
    public  LinkedList insert (LinkedList<T> linkedList, T data){
        Node<T> newNode = new Node<>(data);
        newNode.next =  null;

        if(linkedList.head == null){
            linkedList.head = newNode;
        }
        else {
            Node<T> last =  linkedList.head;
            while (last.next!=null){
                last =  last.next;
            }
            last.next =  newNode;
        }
        return linkedList;
    }
    public  void printList(LinkedList<T> linkedList)
    {
        Node<T> currNode = linkedList.head;

        System.out.print("LinkedList: ");

        // Traverse through the LinkedList
        while (currNode != null) {
            // Print the data at current node
            System.out.print(currNode.data + " ");

            // Go to next node
            currNode = currNode.next;
        }
    }
    public LinkedList<T> insertByIndex(LinkedList<T> linkedList, int index, T data) {
        Node<T> newNode = new Node<>(data);
       newNode.next =  null;
        if (index == 0) {
            newNode.next = linkedList.head;
            linkedList.head = newNode;
            return linkedList;
        }
        Node<T> currNode = linkedList.head;
        Node<T> prev = null;
        int counter = 0;
        while (currNode != null && counter < index) {
            prev = currNode;
            currNode = currNode.next;
            counter++;
        }
        if (counter == index) {
            prev.next = newNode;
            newNode.next = currNode;
        } else {
            System.out.println("Index out of bounds, element not inserted");
        }

        return linkedList;
    }
}
