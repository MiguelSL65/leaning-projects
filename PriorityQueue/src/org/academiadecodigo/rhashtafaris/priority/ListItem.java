package org.academiadecodigo.rhashtafaris.priority;

final class ListItem implements Comparable<ListItem> {

    private final int priority;
    private final String message;
    private final Importance importance;

    ListItem(Importance importance, int priority, String message) {
        this.importance = importance;
        this.priority = priority;
        this.message = message;
    }

    @Override
    public final int compareTo(ListItem item) {

        if (importance.compareTo(item.importance) == 0) {
            return priority - item.priority;
        }

        return importance.compareTo(item.importance);
    }

    @Override
    public String toString() {
        return "TODO item: " +
                "importance = " + importance +
                "priority = " + priority +
                "message = " + message;
    }
}
