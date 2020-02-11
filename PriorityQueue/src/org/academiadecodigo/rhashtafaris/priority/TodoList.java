package org.academiadecodigo.rhashtafaris.priority;

import java.util.PriorityQueue;

public class TodoList {

    private PriorityQueue<ListItem> queue;

    public TodoList() {
        this.queue = new PriorityQueue<>();
    }

    public void add(ListItem item) {
        queue.add(item);
    }

    public boolean isEmpty() {
        return queue.isEmpty();
    }

    public ListItem remove() {
        return queue.poll();
    }
}
