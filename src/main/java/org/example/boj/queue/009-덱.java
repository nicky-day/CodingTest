package org.example.boj.queue;

import java.io.*;
import java.util.Deque;
import java.util.LinkedList;
import java.util.NoSuchElementException;

class 덱 {
}

class MyDeque<E> {
    private int size = 0;
    private Node<E> firstNode = null;
    private Node<E> lastNode = null;

    public static class Node<E> {
        E item;
        Node<E> prev;
        Node<E> next;
        Node(Node<E> prev, E element, Node<E> next) {
            this.prev = prev;
            this.item = element;
            this.next = next;
        }
    }

    public void addFirst(E element) {
        Node<E> newNode = new Node<>(null, element, firstNode);
        if (size == 0) lastNode = newNode;
        else firstNode.prev = newNode;
        firstNode = newNode;
        size++;
    }

    public void addLast(E element) {
        Node<E> newNode = new Node<>(lastNode, element, null);
        if (size == 0) firstNode = newNode;
        else lastNode.next = newNode;
        lastNode = newNode;
        size++;
    }

    public E removeFirst() {
        if (size == 0)
            throw new NoSuchElementException("Deque is empty");

        E item = firstNode.item;
        firstNode = firstNode.next;
        if (firstNode == null) lastNode = null;
        size--;
        return item;
    }

    public E removeLast() {
        if (size == 0)
            throw new NoSuchElementException("Deque is empty");

        E item = lastNode.item;
        lastNode = lastNode.prev;
        if (lastNode == null) firstNode = null;
        size--;
        return item;
    }

    public E getFirst() {
        if (size == 0)
            throw new NoSuchElementException("Deque is empty");
        return firstNode.item;
    }

    public E getLast() {
        if (size == 0)
            throw new NoSuchElementException("Deque is empty");
        return lastNode.item;
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

}

class Main9_1 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        Deque<Integer> dequeue = new LinkedList<>();
        while (N-- > 0) {
            String[] cmd = br.readLine().split(" ");
            if (cmd[0].equals("push_front")) {
                dequeue.offerFirst(Integer.parseInt(cmd[1]));
            }
            else if (cmd[0].equals("push_back")) {
                dequeue.offerLast(Integer.parseInt(cmd[1]));
            }
            else if (cmd[0].equals("pop_front")) {
                bw.write(dequeue.isEmpty() ? "-1\n" : dequeue.pollFirst() + "\n");
            }
            else if (cmd[0].equals("pop_back")) {
                bw.write(dequeue.isEmpty() ? "-1\n" : dequeue.pollLast() + "\n");
            }
            else if (cmd[0].equals("size")) {
                bw.write(dequeue.size() + "\n");
            }
            else if (cmd[0].equals("empty")) {
                bw.write(dequeue.isEmpty() ? "1\n" : "0\n");
            }
            else if (cmd[0].equals("front")) {
                bw.write(dequeue.isEmpty() ? "-1\n" : dequeue.peekFirst() + "\n");
            }
            else if (cmd[0].equals("back")) {
                bw.write(dequeue.isEmpty() ? "-1\n" : dequeue.peekLast() + "\n");
            }
        }
        bw.flush();
    }
}

class Main9_2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        MyDeque<Integer> dequeue = new MyDeque<>();
        while (N-- > 0) {
            String[] cmd = br.readLine().split(" ");
            if (cmd[0].equals("push_front")) {
                dequeue.addFirst(Integer.parseInt(cmd[1]));
            }
            else if (cmd[0].equals("push_back")) {
                dequeue.addLast(Integer.parseInt(cmd[1]));
            }
            else if (cmd[0].equals("pop_front")) {
                bw.write(dequeue.isEmpty() ? "-1\n" : dequeue.removeFirst() + "\n");
            }
            else if (cmd[0].equals("pop_back")) {
                bw.write(dequeue.isEmpty() ? "-1\n" : dequeue.removeLast() + "\n");
            }
            else if (cmd[0].equals("size")) {
                bw.write(dequeue.size() + "\n");
            }
            else if (cmd[0].equals("empty")) {
                bw.write(dequeue.isEmpty() ? "1\n" : "0\n");
            }
            else if (cmd[0].equals("front")) {
                bw.write(dequeue.isEmpty() ? "-1\n" : dequeue.getFirst() + "\n");
            }
            else if (cmd[0].equals("back")) {
                bw.write(dequeue.isEmpty() ? "-1\n" : dequeue.getLast() + "\n");
            }
        }
        bw.flush();
    }
}
