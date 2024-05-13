package org.example.boj.queue;

import java.util.NoSuchElementException;

class MyArrayQueue<E> {
    private Object[] data;
    private int frontIndex;
    private int rearIndex;
    private int capacity;
    private int size;

    public MyArrayQueue(int maxCapacity) {
        this.capacity = maxCapacity;
        this.data = new Object[maxCapacity];
        this.frontIndex = 0;
        this.rearIndex = -1;
        size = 0;
    }

    public boolean enqueue(E element) {
        if (size == capacity) return false;
        rearIndex = (rearIndex + 1) % capacity;
        data[rearIndex] = element;
        size++;
        return true;
    }

    public E deque() {
        if (size == 0) return null;
        E element = (E) data[frontIndex];
        data[frontIndex] = null;
        frontIndex = (frontIndex + 1) % capacity;
        size--;
        return element;
    }

    public E getFront() {
        if (size == 0) return null;
        return (E) data[frontIndex];
    }

    public E getRear() {
        if (size == 0) return null;
        return (E) data[rearIndex];
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean isFull() {
        return size == capacity;
    }
}
