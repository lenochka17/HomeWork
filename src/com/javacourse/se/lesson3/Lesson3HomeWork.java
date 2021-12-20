/*
 * Java 1. Homework 3
 *
 * @ author Batanowa Elena
 *
 * @ version ideaIC-2021.3
 */
package com.javacourse.se.lesson3;

import com.sun.istack.internal.NotNull;

import java.util.Arrays;
import java.util.Random;

class Lesson3HomeWork {

    static Random random = new Random();

    public static void main(String[] args) {

        int[] array = {1, 0, 1, 0, 0, 1};
        System.out.println(Arrays.toString(array));
        changeZeroOrOne(array);
        System.out.println(Arrays.toString(array));


        int[] arr = new int[100];
        fillArrayToHundred(arr);
        System.out.println(Arrays.toString(arr));

        int[] array1 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        changeArray(array1);
        System.out.println(Arrays.toString(array1));

        int[][] square = new int[4][4];
        fillDiagonal(square);
        System.out.println(Arrays.toString(square));

       int length = 3;
       int initialValue = 6;
        lengthAndInitialValue(length, initialValue);

    }

    // 1 задание
    static void changeZeroOrOne(int[] inputArray) {
        int i;
        for (i = 0; i < inputArray.length; i++) {
            inputArray[i] = 1 - inputArray[i];
        }
    }

    // 2 задание
    static void fillArrayToHundred(int[] arr) {
        int i;
        for (i = 0; i < arr.length; i++) {
            arr[i] = (i + 1);

        }
    }

    // 3 задание
    static void changeArray(int[] inputArray) {
        for (int i = 0; i < inputArray.length; i++) {
            inputArray[i] = (inputArray[i] < 6) ? (inputArray[i] * 2) : inputArray[i];

        }


    }

    // 4 задание
    static void fillDiagonal(int[][] square) {
        for (int i = 0; i < square.length; i++) {
            square[i][i] = 1;
        }

    }
    static int[] lengthAndInitialValue(int length, int initialValue) {
        int[] result = new int[length];
        int i;
        for(i =0; i < result.length; i++) {
            result[i] = initialValue;
        }
        return result;
    }
}

