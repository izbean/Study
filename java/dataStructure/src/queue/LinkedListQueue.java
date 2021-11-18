package queue;

import java.util.NoSuchElementException;

class LinkedListQueue<T> implements Queue<T> {

    private LinkedListQueueNode<T> head;
    private LinkedListQueueNode<T> tail;
    private int size;

    public LinkedListQueue() {
        this.head = null;
        this.tail = null;
        this.size = 0;
    }

    @Override
    public boolean add(T e) {
        LinkedListQueueNode<T> newNode = new LinkedListQueueNode<>(e);
        if (isEmpty()) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }

        this.size++;

        return true;
    }

    @Override
    public boolean offer(T t) {
        return add(t);
    }

    @Override
    public T poll() {
        if (isEmpty())
            return null;

        head = head.next;
        size--;

        return head.value;
    }

    @Override
    public T peek() {
        if (isEmpty()) {
            return null;
        }

        return head.value;
    }

    @Override
    public T remove() {
        if (isEmpty())
            throw new NoSuchElementException("큐에서 삭제할 데이터를 찾을 수 없습니다.");

        head = head.next;
        size--;

        return head.value;
    }

    @Override
    public int size() {
        return this.size;
    }

    @Override
    public boolean isEmpty() {
        return this.size == 0;
    }

    @Override
    public boolean contains(T e) {
        if (isEmpty())
            throw new NullPointerException();

        for (LinkedListQueueNode<T> node = head; node != null; node = node.next) {
            if (node.value == e)
                return true;
        }

        return false;
    }

    @Override
    public void clear() {
        head = null;
        tail = null;
        size = 0;
    }

    @Override
    public String toString() {
        return "LinkedListQueue{" +
                "head=" + head +
                ", tail=" + tail +
                ", size=" + size +
                '}';
    }

    public static class LinkedListQueueNode<T> {
        T value;
        LinkedListQueueNode<T> next;

        public LinkedListQueueNode(T value) {
            this.value = value;
        }

        @Override
        public String toString() {
            return "LinkedListQueueNode{" +
                    "value=" + value +
                    ", next=" + next +
                    '}';
        }
    }

}
