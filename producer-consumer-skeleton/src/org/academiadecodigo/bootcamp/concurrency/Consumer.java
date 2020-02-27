package org.academiadecodigo.bootcamp.concurrency;

import org.academiadecodigo.bootcamp.concurrency.bqueue.BQueue;

/**
 * Consumer of integers from a blocking queue
 */
public class Consumer implements Runnable {

    private final BQueue<Integer> queue;
    private int elementNum;
    private int num;

    /**
     * @param queue      the blocking queue to consume elements from
     * @param elementNum the number of elements to consume
     */
    public Consumer(BQueue queue, int elementNum) {
        this.queue = queue;
        this.elementNum = elementNum;
    }

    @Override
    public void run() {

        while (num < 10) {

            queue.poll();
            num++;
            System.out.println("Consumer purchased " + num);

            try {
                Thread.sleep(1000);

            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
