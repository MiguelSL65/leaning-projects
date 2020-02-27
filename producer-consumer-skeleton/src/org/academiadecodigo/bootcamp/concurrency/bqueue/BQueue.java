package org.academiadecodigo.bootcamp.concurrency.bqueue;

import java.util.PriorityQueue;

/**
 * Blocking Queue
 *
 * @param <T> the type of elements stored by this queue
 */
public class BQueue<T> {

    private int limit;
    private PriorityQueue<T> queue;

    /**
     * Constructs a new queue with a maximum size
     *
     * @param limit the queue size
     */
    public BQueue(int limit) {

        this.limit = limit;
        this.queue = new PriorityQueue<>(limit);
    }

    /**
     * Inserts the specified element into the queue
     * Blocking operation if the queue is full
     *
     * @param data the data to add to the queue
     */
    public void offer(T data) {

        synchronized (this) {

            while (getLimit() == getSize()) {

                try {
                    wait();

                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            queue.offer(data);
            notifyAll();
        }

    }

    /**
     * Retrieves and removes data from the head of the queue
     * Blocking operation if the queue is empty
     *
     * @return the data from the head of the queue
     */
    public T poll() {

        synchronized (this) {

            while (getSize() == 0) {

                try {
                    wait();

                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                notifyAll();
            }
            return queue.poll();}
    }

    /**
     * Gets the number of elements in the queue
     *
     * @return the number of elements
     */
    public int getSize() {

        return queue.size();
    }

    /**
     * Gets the maximum number of elements that can be present in the queue
     *
     * @return the maximum number of elements
     */
    public int getLimit() {

        return this.limit;
    }
}
