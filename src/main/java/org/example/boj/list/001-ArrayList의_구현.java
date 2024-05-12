package org.example.boj.list;

import java.util.Arrays;

class MyArrayList<E> {
    private static final int DEFAULT_CAPACITY = 10;
    private int size = 0;
    private Object[] data;

    public MyArrayList(int initialCapacity) {
        data = new Object[initialCapacity];
    }

    public MyArrayList() {
        this(DEFAULT_CAPACITY);
    }

    public int size() {
        return size;
    }

    public void add(E element) {
        if (size == data.length) {
            growCapacity();
        }
        data[size++] = element;
    }

    private void growCapacity() {
        int newCapacity = data.length + (data.length >> 1);
        data = Arrays.copyOf(data, newCapacity);
    }

    public E get(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
        }
        return (E) data[index];
    }

    public void set(int inx, E element) {
        if (inx < 0 || inx >= size) {
            throw new IndexOutOfBoundsException("Index: " + inx + ", Size: " + size);
        }
        data[inx] = element;
    }

    public void insert(int idx, E element) {
        if (size == data.length) growCapacity();
        int copyLength = size - idx;
        /**
         * arrayCopy(Object src, int srcPos, Object dest, int destPos, int length)
         * src[srcPos]로부터 copyLength개 원소를 dest[destPos]로 복사한다.
         */
        System.arraycopy(data, idx, data, idx + 1, copyLength);
        data[idx] = element;
        size++;
    }

    public void remove(int idx) {
        if (idx < 0 || idx >= size) {
            throw new IndexOutOfBoundsException("Index: " + idx + ", Size: " + size);
        }
        int copyLength = size - idx - 1;
        System.arraycopy(data, idx + 1, data, idx, copyLength);
        size--;
    }

}
class Main1 {
    public static void main(String[] args) {

    }
}
