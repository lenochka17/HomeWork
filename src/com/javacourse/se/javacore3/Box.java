package com.javacourse.se.javacore3;

import java.util.ArrayList;
import java.util.Iterator;

public class Box {

    public ArrayList<Fruit> list;

    public Box(){
        list = new ArrayList<>();
    }
    public float getWeight(){
        float result = 0;
        Iterator<Fruit> iter = list.iterator();
        while(iter.hasNext()) {
            result += iter.next().getWeight();
        }
        return result;

    }

    public boolean compare(Box box2){

        return this.getWeight() == box2.getWeight();
    }

    public void add(Fruit fruit){

        if ( list.size() == 0) {
            list.add(fruit);
        }
        else {
            if(list.get(0).getWeight()!=fruit.getWeight())
                return;
            else list.add(fruit);
        }

    }

    public void send(Box box){
        if (this.list.size() == 0)
            return;
        if (box.getWeight() != 0) {
            if (list.get(0).getWeight()!=box.list.get(0).getWeight())
                return;

        }
        Iterator<Fruit> iter = list.iterator();
        while(iter.hasNext()) {
            box.add(iter.next());
        }

        list.clear();
    }


}
