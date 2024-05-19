package org.example.queue.boj;

import java.io.*;
import java.util.LinkedList;
import java.util.NoSuchElementException;
import java.util.Queue;

class 큐 {
}

class MyQueue<E> {
    private int size = 0;
    private Node<E> frontNode;
    private Node<E> rearNode;

    public static class Node<E> {
        E item;
        Node next;

        public Node(E element, Node next) {
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
        if (size == 0) {
            throw new NoSuchElementException("Queue is empty");
        }
        E item = frontNode.item;
        frontNode = frontNode.next;
        if (frontNode == null) rearNode = null;
        size--;
        return item;
    }

    public E getFront() {
        if (size == 0) {
            throw new NoSuchElementException("Queue is empty");
        }
        return frontNode.item;
    }

    public E getRear() {
        if (size == 0) {
            throw new NoSuchElementException("Queue is empty");
        }
        return rearNode.item;
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }
}

class Main3_1 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        Queue<Integer> queue = new LinkedList<>();
        int lastValue = -1;
        while (N-- > 0) {
            String[] cmd = br.readLine().split(" ");
            if (cmd[0].equals("push")) {
                lastValue = Integer.parseInt(cmd[1]);
                queue.offer(lastValue);
            } else if (cmd[0].equals("pop")) {
                bw.write(queue.isEmpty() ? "-1\n" : queue.poll() + "\n");
            } else if (cmd[0].equals("size")) {
                bw.write(queue.size() + "\n");
            } else if (cmd[0].equals("empty")) {
                bw.write(queue.isEmpty() ? "1\n" : "0\n");
            } else if (cmd[0].equals("front")) {
                bw.write(queue.isEmpty() ? "-1\n" : queue.peek() + "\n");
            } else if (cmd[0].equals("back")) {
                bw.write(queue.isEmpty() ? "-1\n" : lastValue + "\n");
            }
        }
        bw.flush();
    }
}

class Main3_2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        MyQueue<Integer> queue = new MyQueue<>();
        while (N-- > 0) {
            String[] cmd = br.readLine().split(" ");
            if (cmd[0].equals("push")) {
                queue.enqueue(Integer.parseInt(cmd[1]));
            } else if (cmd[0].equals("pop")) {
                bw.write(queue.isEmpty() ? "-1\n" : queue.dequeue() + "\n");
            } else if (cmd[0].equals("size")) {
                bw.write(queue.size() + "\n");
            } else if (cmd[0].equals("empty")) {
                bw.write(queue.isEmpty() ? "1\n" : "0\n");
            } else if (cmd[0].equals("front")) {
                bw.write(queue.isEmpty() ? "-1\n" : queue.getFront() + "\n");
            } else if (cmd[0].equals("back")) {
                bw.write(queue.isEmpty() ? "-1\n" : queue.getRear() + "\n");
            }
        }
        bw.flush();
    }
}
