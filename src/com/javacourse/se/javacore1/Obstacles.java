package com.javacourse.se.javacore1;

public class Obstacles {
    public String obstaclesName;
    private static final int obstaclesTime = 2;


    public Obstacles(String obstaclesName){
        this.obstaclesName = obstaclesName;


    }

    public int overcome(String name){
        return name.length() * obstaclesTime;
    }
}
