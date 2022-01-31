package com.javacourse.se.javacore4;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Phone {


    HashMap<String, ArrayList<String>> NameAndPhone = new HashMap<>();
    public void add(String name, String number){

        if (!NameAndPhone.containsKey(name)) {
            ArrayList<String> list= new ArrayList<>();
            list.add(number);
            NameAndPhone.put(name, list);
        } else {
            ArrayList<String> list2 = NameAndPhone.get(name);
            list2.add(number);
        }

    }

    public ArrayList<String> get(String name){
        if (!NameAndPhone.containsKey(name))
            System.out.println("Нет записи в БД");
        return NameAndPhone.get(name);

    }

    public void init (){

        add("Ivanov", "+79997772204");
        add("Petrov", "+79995552259");
        add("Ivanov", "+79996662210");
        add("Gusev", "+79998882297");
        add("Sunduk", "+79994442268");
        add("Trinadcatiy", "+79993332264");
        add("Winner13", "+79991112245");
        add("Winner13", "+79991110005");

        for (
                Map.Entry<String, ArrayList<String>> element: NameAndPhone.entrySet()){
            System.out.println(element.getKey() + " " + element.getValue());
        }


    }

}
