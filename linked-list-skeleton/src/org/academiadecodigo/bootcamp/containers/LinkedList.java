package org.academiadecodigo.bootcamp.containers;

public class LinkedList <E> {

    private Node head;
    private int length = 0;
    private E e;

    public void set(E e) {
        this.e = e;
    }

    public E get() {
        return e;
    }

    public LinkedList() {
        this.head = new Node(null);
    }

    public int size() {
        return length;
    }

    /**
     * Adds an element to the end of the list
     * @param data the element to add
     */
    public void add(E data)  {

        Node node = new Node(data);
        Node iterator = head;

        while (iterator.getNext() != null){
            iterator = iterator.getNext();
        }
        iterator.setNext(node);
        length++;

    }

    /**
     * Obtains an element by index
     * @param index the index of the element
     * @return the element
     */
    public Object get(int index) {

        Node iterator = head;
        int counter = 0;

        while (counter <= index) {

            if (iterator.getNext() == null) {
                return null;
            }

            iterator = iterator.getNext();
            counter++;
        }

        return iterator.getData();
    }

    /**
     * Returns the index of the element in the list
     * @param data element to search for
     * @return the index of the element, or -1 if the list does not contain element
     */
    public int indexOf(E data) {

        Node iterator = head.getNext();
        int index = 0;

        while (iterator != null) {

            if (iterator.getData() == data) {
                return index;
            }

            iterator = iterator.getNext();
            index++;
        }

        return -1;
    }

    /**
     * Removes the first occurrence of an element from the list
     * @param data the element to remove
     * @return true if element was removed
     */
    public boolean remove(E data) {

        Node previous = head;
        Node iterator = head.getNext();

        while (iterator != null) {


            if (iterator.getData().equals(data)) {

                previous.setNext(iterator.getNext());
                length--;
                return true;
            }

            previous = iterator;
            iterator = iterator.getNext();
        }

        return false;
    }

    private class Node {

        private Object data;
        private Node next;

        public Node(E data) {
            this.data = data;
            next = null;
        }

        public Object getData() {
            return data;
        }

        public void setData(E data) {
            this.data = data;
        }

        public Node getNext() {
            return next;
        }

        public void setNext(Node next) {
            this.next = next;
        }
    }

}
