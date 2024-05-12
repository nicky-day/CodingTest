package org.example.boj.list;


class MySingleLinkedList<E> {
    private int size = 0;
    private Node<E> firstNode = null;
    private Node<E> lastNode = null;

    public static class Node<E> {
        E item;
        Node<E> next;

        Node(E element, Node<E> next) {
            this.item = element;
            this.next = next;
        }
    }

    public void addFirst(E element) {
        Node<E> newNode = new Node<>(element, firstNode);
        if (size == 0) lastNode = firstNode;
        firstNode = newNode;
        size++;
    }

    public void add(E element) {
        Node<E> newNode = new Node<>(element, null);
        if (size == 0) firstNode = newNode;
        else lastNode.next = newNode;
        lastNode = newNode;
        size++;
    }

    public Node<E> getNode(int idx) {
        if (idx < 0 || idx >= size) {
            throw new IndexOutOfBoundsException("Index: " + idx + ", Size: " + size);
        }
        Node<E> currentNode = firstNode;
        for (int i = 0; i < idx; i++) {
            currentNode = currentNode.next;
        }
        return currentNode;
    }

    public E get(int idx) {
        return getNode(idx).item;
    }

    public void set(int idx, E element) {
        Node<E> targetNode = getNode(idx);
        targetNode.item = element;
    }

    public void insert(Node<E> prevNode, E element) {
        Node<E> newNode = new Node<>(element, prevNode.next);
        prevNode.next = newNode;
        if (newNode.next == null) lastNode = newNode;
        size++;
    }

    public void insert(int idx, E element) {
        if (idx < 0 || idx > size) {
            throw new IndexOutOfBoundsException("Index: " + idx + ", Size: " + size);
        }
        if (idx == 0) addFirst(element);
        else if (idx == size) add(element);
        else {
            Node<E> prevNode = getNode(idx - 1);
            insert(prevNode, element);
        }
    }

    public void removeFirst() {
        if (firstNode != null) {
            firstNode = firstNode.next;
            if (firstNode == null) lastNode = null;
            size--;
        }
    }

    public void removeNext(Node<E> prevNode) {
        if (prevNode.next != null) {
            prevNode.next = prevNode.next.next;
            if (prevNode.next == null) lastNode = prevNode;
            size--;
        }
    }

    public void remove(int idx) {
        if (idx < 0 || idx >= size) {
            throw new IndexOutOfBoundsException("Index: " + idx + ", Size: " + size);
        }
        if (idx == 0) removeFirst();
        else {
            Node<E> prevNode = getNode(idx - 1);
            removeNext(prevNode);
        }
    }

    public Node<E> getFirstNode() {
        return firstNode;
    }

    public Node<E> getLastNode() {
        return lastNode;
    }

    public int size() {
        return size;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        Node<E> currentNode = firstNode;
        sb.append("[");
        for (int i = 0; i < size; i++) {
            if (i > 0) sb.append(", ");
            sb.append(currentNode.item.toString());
            currentNode = currentNode.next;
        }
        sb.append("]");
        return sb.toString();
    }
}

class Main2 {
    public static void main(String[] args) {
    }
}
