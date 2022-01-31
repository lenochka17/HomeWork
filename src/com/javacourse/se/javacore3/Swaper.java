package com.javacourse.se.javacore3;

import java.util.Arrays;


public class Swaper {
    public static void swap(Object[] array, int n1, int n2){
        System.out.println("Заданные значение: "+ Arrays.toString(array));
        Object swaper = array[n1];
        array[n1]=array[n2];
        array[n2]=swaper;
        System.out.println("Результат перестановки местами: "+Arrays.toString(array)+"\n=========================");
    }
}
