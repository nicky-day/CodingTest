package org.example.list.boj;


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


class MyDoubleLinkedList<E> {
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

    public void add(E element) {
        Node<E> newNode = new Node<>(lastNode, element, null);
        if (size == 0) firstNode = newNode;
        else lastNode.next = newNode;
        lastNode = newNode;
        size++;
    }

    private void addFirst(E element) {
        Node<E> newNode = new Node<>(null, element, firstNode);
        if (size == 0) lastNode = newNode;
        else firstNode.prev = newNode;
        firstNode = newNode;
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
        Node<E> newNode = new Node<>(prevNode, element, prevNode.next);
        if (newNode.next != null) newNode.next.prev = newNode;
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

    public void remove(Node<E> targetNode) {
        if (targetNode.prev != null) {
            targetNode.prev.next = targetNode.next;
        } else firstNode = targetNode.next;

        if (targetNode.next != null) {
            targetNode.next.prev = targetNode.prev;
        } else lastNode = targetNode.prev;

        targetNode.item = null;
        targetNode.prev = null;
        targetNode.next = null;
        size--;
    }

    public void remove(int idx) {
        if (idx < 0 || idx >= size) {
            throw new IndexOutOfBoundsException("Index: " + idx + ", Size: " + size);
        }
        Node<E> targetNode = getNode(idx);
        remove(targetNode);
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
        sb.append('[');
        for(int i = 0; i < size; i++) {
            if (i > 0) sb.append(", ");
            sb.append(currentNode.item.toString());
            currentNode = currentNode.next;
        }
        sb.append(']');
        return sb.toString();
    }
}


class Main2_1 {
    public static void main(String[] args) {
        MySingleLinkedList<Integer> list = new MySingleLinkedList<>();

        // LinkedList의 add: O(1)
        list.add(1);            // [1]
        list.add(2);            // [1, 2]
        list.add(3);            // [1, 2, 3]

        // LinkedList의 특정 위치값에 대한 add: O(N)
        list.insert(0, 4);      // [4, 1, 2, 3]
        list.insert(3, 5);      // [4, 1, 2, 5, 3]

        // LinkedList의 특정 위치값에 대한 set: O(N)
        list.set(2, -1);        // [4, 1, -1, 5, 3]
        System.out.println(list);

        // LinkedList.java는 ListIterator를 사용해 순차 탐색을 지원하지만
        // 이 클래스는 Node 접근자를 제공하여 직접 조작하는 형태로 사용합니다.
        // ListIterator와는 달리 실제 Node를 가리킵니다.
        MySingleLinkedList.Node<Integer> currentNode = list.getFirstNode();

        // 2칸 뒤 Node로 이동 후 현재 노드 정보를 출력하는 예제입니다.
        int currentIndex = 0;   // index: 0, value: 4
        for (int i = 0; i < 2; i++) {
            currentNode = currentNode.next;
            currentIndex++;
        }
        // index: 2, value: -1
        System.out.printf("index: %d, value: %d\n", currentIndex, currentNode.item);

        // LinkedList의 특정 위치값에 대한 get: O(N)
        System.out.printf("index: %d, value: %d\n", 4, list.get(4));

        // LinkedList의 순차 접근 중 특정 노드에 대한 remove: O(1)
        list.removeNext(currentNode);
        System.out.println(list);   // [4, 1, -1, 3]

        // LinkedList의 특정 위치값에 대한 remove: O(N)
        list.remove(3);             // [4, 1, -1];
        int size = list.size();     // 3
        System.out.printf("Size: %d, %s", size, list);
    }
}

class Main2_2 {
    public static void main(String[] args) {
        MyDoubleLinkedList<Integer> list = new MyDoubleLinkedList<>();

        // LinkedList의 add: O(1)
        list.add(1);            // [1]
        list.add(2);            // [1, 2]
        list.add(3);            // [1, 2, 3]

        // LinkedList의 특정 위치값에 대한 add: O(N)
        list.insert(0, 4);      // [4, 1, 2, 3]
        list.insert(3, 5);      // [4, 1, 2, 5, 3]

        // LinkedList의 특정 위치값에 대한 set: O(N)
        list.set(2, -1);        // [4, 1, -1, 5, 3]
        System.out.println(list);

        // LinkedList.java는 ListIterator를 사용해 순차 탐색을 지원하지만
        // 이 클래스는 Node 접근자를 제공하여 직접 조작하는 형태로 사용합니다.
        // ListIterator와는 달리 실제 Node를 가리킵니다.
        MyDoubleLinkedList.Node<Integer> currentNode = list.getFirstNode();

        // 3칸 뒤 Node로 이동 후 현재 노드 정보를 출력하는 예제입니다.
        int currentIndex = 0;   // index: 0, value: 4
        for (int i = 0; i < 3; i++) {
            currentNode = currentNode.next;
            currentIndex++;
        }
        // index: 3, value: 5
        System.out.printf("index: %d, value: %d\n", currentIndex, currentNode.item);

        // 계속 같은 변수를 사용해 2칸 앞 원소로 이동 후 현재 노드 정보를 출력하는 예제입니다.
        for (int i = 0; i < 2; i++) {
            currentNode = currentNode.prev;
            currentIndex--;
        }
        // index: 1, value: 1
        System.out.printf("index: %d, value: %d\n", currentIndex, currentNode.item);

        // LinkedList의 특정 위치값에 대한 get: O(N)
        System.out.printf("index: %d, value: %d\n", 2, list.get(2));

        // LinkedList의 순차 접근 중 특정 노드에 대한 remove: O(1)
        list.remove(currentNode);
        System.out.println(list);   // [4, -1, 5, 3]

        // LinkedList의 특정 위치값에 대한 remove: O(N)
        list.remove(3);             // [4, -1, 5];
        int size = list.size();     // 3
        System.out.printf("Size: %d, %s", size, list);
    }
}
