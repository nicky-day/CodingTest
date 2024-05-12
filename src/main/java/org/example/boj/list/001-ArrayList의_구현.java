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

    public int size() {
        return size;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append('[');
        for(int i = 0; i < size; i++) {
            if (i > 0) sb.append(", ");
            sb.append(data[i].toString());
        }
        sb.append(']');
        return sb.toString();
    }
}

class Main1 {
    public static void main(String[] args) {
        MyArrayList<Integer> list = new MyArrayList<>(4);
        // ArrayList는 initial capacity를 지정할 수 있습니다.
        // 지정하지 않는다면 default capacity만큼의 배열이 생성됩니다.

        // ArrayList의 add: O(1)
        list.add(1);            // [1]
        list.add(2);            // [1, 2]
        list.add(3);            // [1, 2, 3]
        list.add(4);            // [1, 2, 3, 4]
        // 현재 capacity를 넘게되면 내부적으로 증가시킨 배열로 값을 이동합니다.
        list.add(5);            // [1, 2, 3, 4, 5]

        // ArrayList의 특정 위치값에 대한 set: O(1)
        list.set(2, -1);        // [1, 2, -1, 4, 5]

        // ArrayList의 위치를 지정하는 insert: O(N)
        list.insert(3, 10);     // [1, 2, -1, 10, 4, 5]
        System.out.println(list);

        for (int i = 0; i < list.size(); i++) {
            // ArrayList의 특정 위치값에 대한 get: O(1)
            int num = list.get(i);
            System.out.printf("%d-th num: %d\n", i, num);
        }

        // ArrayList의 특정 위치값에 대한 remove: O(N)
        list.remove(1);             // [1, -1, 10, 4, 5]
        int size = list.size();     // 5
        System.out.printf("Size: %d, %s\n", size, list);
    }
}
