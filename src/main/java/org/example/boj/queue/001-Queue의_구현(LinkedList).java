package org.example.boj.queue;

import java.util.NoSuchElementException;

class MyListQueue<E> {
    private int size = 0;
    private Node<E> frontNode;
    private Node<E> rearNode;

    public static class Node<E> {
        E item;
        Node<E> next;

        Node(E element, Node<E> next) {
            this.item = element;
            this.next = next;
        }
    }

    public void enqueue(E element) {
        Node<E> newNode = new Node<>(element, null);
        if (size == 0) frontNode = newNode;
        else rearNode.next = newNode;
        rearNode = newNode;
        size++;
    }

    public E dequeue() {
        if (size == 0)
            throw new NoSuchElementException("Queue is empty");

        E item = frontNode.item;
        frontNode = frontNode.next;
        if (frontNode == null) rearNode = null;
        size--;
        return item;
    }

    public E getFront() {
        if (size == 0)
            throw new NoSuchElementException("Queue is empty");
        return frontNode.item;
    }

    public E getRear() {
        if (size == 0)
            throw new NoSuchElementException("Queue is empty");
        return rearNode.item;
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }
}
