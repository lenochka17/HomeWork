package com.javacourse.se.javacore3;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        String changer[] = {"1", "2", "4", "5", "7", "8"};
        Swaper.swap(changer,3, 5);

        Box box1 = new Box();
        Box box2 = new Box();
        box1.add(new Apple());
        box1.add(new Orange());
        box2.add(new Apple());

        System.out.println(box1.compare(box2));


    }

}
