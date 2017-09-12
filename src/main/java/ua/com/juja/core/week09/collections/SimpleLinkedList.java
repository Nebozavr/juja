package ua.com.juja.core.week09.collections;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class SimpleLinkedList<E> implements SimpleList<E> {
    private Node<E> first = null; // head
    private Node<E> last = null; // tail
    private int size = 0;

    private static class Node<T> {
        private Node<T> prev;
        private T item;
        private Node<T> next;

        private Node(Node<T> prev, T item, Node<T> next) {
            this.prev = prev;
            this.item = item;
            this.next = next;
        }
    }

    private void checkIndex(int index) {
        if (index < 0 || size < index) {
            throw new ArrayIndexOutOfBoundsException();
        }
    }

    private Node<E> node(int index) {
        if (index < size / 2) {
            Node<E> tmp = first;
            for (int i = 0; i < index; i++) {
                tmp = tmp.next;
            }
            return tmp;
        } else {
            Node<E> x = last;
            for (int i = size - 1; i > index; i--) {
                x = x.prev;
            }
            return x;
        }
    }

    private E unlink(Node<E> x) {
        // assert x != null;
        final E element = x.item;
        final Node<E> next = x.next;
        final Node<E> prev = x.prev;

        if (prev == null) {
            first = next;
        } else {
            prev.next = next;
            x.prev = null;
        }

        if (next == null) {
            last = prev;
        } else {
            next.prev = prev;
            x.next = null;
        }

        x.item = null;
        size--;
        return element;
    }

    @Override
    public boolean add(E newElement) {
        final Node<E> tmp = last;
        final Node<E> newNode = new Node<>(tmp, newElement, null);
        last = newNode;
        if (tmp == null) {
            first = newNode;
        } else {
            tmp.next = newNode;
        }
        size++;
        return true;
    }

    @Override
    public E get(int index) {
        checkIndex(index);
        return node(index).item;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public E remove(int index) {
        checkIndex(index);
        return unlink(node(index));
    }

    @Override
    public Iterator<E> iterator() {
        return new Itr();
    }

    private class Itr implements Iterator<E> {
        private Node<E> lastReturned = null;
        private Node<E> next = first;
        private int nextIndex = 0;


        @Override
        public boolean hasNext() {
            return nextIndex < size;
        }

        @Override
        public E next() {
            if (!hasNext())
                throw new NoSuchElementException();

            lastReturned = next;
            next = next.next;
            nextIndex++;
            return lastReturned.item;
        }

        @Override
        public void remove() {
            if (lastReturned == null)
                throw new IllegalStateException();

            Node<E> lastNext = lastReturned.next;
            unlink(lastReturned);
            if (next == lastReturned)
                next = lastNext;
            else
                nextIndex--;
            lastReturned = null;
        }

    }

    @Override
    public String toString() {
        String result = "[";

        if (size == 0) {
            return result = "[]";
        }

        for (int i = 0; i < size; i++) {
            Node node = first;
            if (i == size - 1){
                result += node.item + "]";
            } else {
                result += node.item + ", ";
                first = first.next;
            }
        }
        return result;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;

        if (o instanceof SimpleLinkedList) {
            SimpleLinkedList<E> that = (SimpleLinkedList<E>) o;

            if (size != that.size) return false;
            {
                Iterator list1 = this.iterator();
                Iterator list2 = that.iterator();

                while (list1.hasNext()) {
                    Object o1 = list1.next();
                    Object o2 = list2.next();

                    if (!(o1 == null ? o2 == null : o1.equals(o2))) {
                        return false;
                    }
                }
                return true;
            }
        }
        return false;
    }

    @Override
    public int hashCode() {
        int hash = 0;

        if (size > 0) {
            for (Node node = first; node.next != null; node = node.next) {
                hash += node.item.hashCode();
            }
        }

        return hash;
    }

   /*BODY*/
}


