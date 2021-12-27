/*
 * Java 1. Homework 3
 *
 * @ author Batanowa Elena
 *
 * @ version ideaIC-2021.3
 */
package com.javacourse.se.lesson3;

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


        int[][] doubleArr = new int[4][4];
        fillArr4(doubleArr);


        int[] result = fillArr5(12, 5);
        System.out.println(Arrays.toString(result));
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
    public static void fillArr4(int[][] doubleArr) {
        int n = doubleArr.length;
        for (int i = 0; i < doubleArr.length; i++) {
            for (int j = 0; j < doubleArr[i].length; j++) {
                doubleArr[i][j] = 2;
                if (i == j) {
                    doubleArr[i][j] = 1;
                }
                if (i == n - j - 1) {
                    doubleArr[i][j] = 1;
                }
            }
        }
        for (int i = 0; i < doubleArr.length; i++) {
            System.out.println(Arrays.toString(doubleArr[i]));
        }
    }
    // 5 задание

    public static int[] fillArr5(int len, int initialValue) {
        int[] result;
        result = new int[len];
        for (int i = 0; i < result.length; i++) {
            result[i] = initialValue;
        }
        return result;
    }
}

