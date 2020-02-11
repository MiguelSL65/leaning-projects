package org.academiadecodigo.rhashtafaris.projectninja;

import java.util.Iterator;

public class LinkedList<Balls> implements Iterable<Balls> {

    private Node head;
    private int length;
    private Balls balls;

    public LinkedList() {
        this.length = 0;
        this.head = new Node(null);
    }

    public int size() {
        return this.length;
    }

    public void setT(Balls e){
        this.balls = e;
    }

    public Balls getType(){
        return balls;
    }


    public Iterator<Balls> iterator(){

        return new BallsIterator<Balls>(this);
    }



    public void add(Balls data) {

        Node node = new Node(data);
        Node iterator = head;

        while (iterator.getNext() != null) {
            iterator = iterator.getNext();
        }


        iterator.setNext(node);
        length++;
    }


    Balls get(int index) {

        Node iterator = head.getNext();

        while (iterator != null) {

            if (index == 0) {
                return iterator.getData();
            }

            iterator = iterator.getNext();
            index--;
        }

        // not found
        return null;

    }

    boolean remove(Balls data) {

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

        /**
         * Reference to the next Node in the list
         */
        private Node next;

        /**
         * Reference to the data
         */
        private Balls data;

        Node(Balls data) {
            this.data = data;
            this.next = null;
        }

        void setNext(Node next) {
            this.next = next;
        }

        Balls getData() {
            return data;
        }

        Node getNext() {
            return next;
        }
    }

}
