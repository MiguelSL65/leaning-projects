package org.academiadecodigo.rhashtafaris.priority;

public class Main {

    public static void main(String[] args) {

        TodoList myList = new TodoList();
        myList.add(new ListItem(Importance.LOW, 1, "GO HOME."));
        myList.add(new ListItem(Importance.MEDIUM, 2, "GO HARD OR GO HOME"));
        myList.add(new ListItem(Importance.HIGH, 3, "GO FUCKNG NUTS."));
        myList.add(new ListItem(Importance.MEDIUM, 2, "GO HALFWAY"));

        while (!myList.isEmpty()) {
            System.out.println(myList.remove());
        }

    }
}
