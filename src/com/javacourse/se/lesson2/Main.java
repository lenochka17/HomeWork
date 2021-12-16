package com.javacourse.se.lesson2;

public class Main {
    public static void main(String[] args) {
        int a = 5;
        int b = 4;
        int sum = a + b;

        boolean flag = within10and20(sum);
        System.out.println(flag);

        //2
        int number = 10;
        printNumber(number);

        //3
        int c = 4;
        boolean check = noOrYes(c);
        System.out.println(check);

        //4
        printWordNTimes();


    }

    static boolean within10and20(int sum) {
        return sum >= 10 && sum <= 20;
    }

    static void printNumber(int number) {
        if (0 <= number) {
            System.out.println("+");
        } else {
            System.out.println("-");
        }
    }

    static boolean noOrYes(int c) {
        return c > 0;
    }

    static void printWordNTimes() {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 1; j++) {
                System.out.print("String");
            }
            System.out.println();
        }

    }
}
