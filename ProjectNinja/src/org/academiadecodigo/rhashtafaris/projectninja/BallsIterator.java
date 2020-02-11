package org.academiadecodigo.rhashtafaris.projectninja;

import java.util.Iterator;

public class BallsIterator<Balls> implements Iterator<Balls> {

    LinkedList<Balls> list;
    private int iterator;

    private Balls nextElement;

    public BallsIterator(LinkedList<Balls> list){

        this.list = list;
        iterator = 0;

    }


    public boolean hasNext(){

        nextElement = list.get(iterator);

        if(nextElement == null){
            iterator = 0;
            return false;
        }

        iterator++;
        return true;
    }

    public Balls next(){

        return nextElement;

    }
}
