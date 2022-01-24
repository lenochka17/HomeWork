package com.javacourse.se.javacore4;

import java.util.*;

public class Core4 {
    public static void main(String[] args) {


        String[] words = {"hello", "allo", "aloha", "bingo", "aloha", "bingo", "allo", "allo", "aloha", "bingo", "aloha",};
        HashMap<String, Integer> result = new HashMap<>();

        for (String word : words) {
            if (!result.containsKey(word)) {
                result.put(word, 1);
            } else {
                result.put(word, result.get(word) + 1);
            }
        }
        for (Map.Entry<String, Integer> element : result.entrySet()) {
            System.out.println(element.getKey() + " " + element.getValue());
        }
        String[] newWords = {"hello", "allo", "aloha", "bingo", "aloha", "bingo", "allo", "allo", "aloha", "bingo", "aloha",};
        HashSet<String> hashSet = new HashSet<>();
        List<String> list = Arrays.asList(newWords);
        hashSet.addAll(list);
        System.out.println(hashSet);

        System.out.println("_______________________________________________");
        Phone telephone = new Phone();

        telephone.init();
        System.out.println("_______________________________________________");
        System.out.println(telephone.get("Ivanov1"));

    }


}
