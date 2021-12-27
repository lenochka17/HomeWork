/*
 * Java 1. Homework 6
 *
 * @ author Batanowa Elena
 *
 * @ version ideaIC-2021.3
 */
class Lesson6HomeWork {
    public static void main(String[] args) {
        Cat cat = new Cat("Murzik", "Grey", 7, 250);
        Dog dog = new Dog("Sharik", "black", 6, 400);
        cat.drift();
        cat.run();
        System.out.println(" ");
        dog.drift();
        dog.run();
        System.out.println(" ");

    }
}

class Cat extends Animal {
    Cat(String name, String color, int age, int obstacles) {
        super(name, color, age, obstacles);
        this.maxRun = 200;
        this.maxDrift = 0;

    }


}

class Dog extends Animal {
    Dog(String name, String color, int age, int obstacles) {
        super(name, color, age, obstacles);
        this.maxRun = 500;
        this.maxDrift = 10;

    }

}

abstract class Animal {
    protected String name;
    protected String color;
    protected int age;
    protected int obstacles;
    int maxRun;
    int maxDrift;


    Animal(String name, String color, int age, int obstacles) {
        this.name = name;
        this.color = color;
        this.age = age;
        this.obstacles = obstacles;
        this.maxRun = 0;
        this.maxDrift = 0;


    }

    void run() {

        if (maxRun <= 0)
            System.out.println(name + " не умеет бегать");
        else if (maxRun >= obstacles)
            System.out.println(name + " пробежал " + obstacles + "м ");
        else
            System.out.println("для " + name + " дистанция слишком большая");

    }

    void drift() {
        if (maxDrift <= 0)
            System.out.println(name + " не умеет плавать");
        else if (maxDrift >= obstacles)
            System.out.println(name + " проплыл " + obstacles + "м ");
        else
            System.out.println("для " + name + " дистанция слишком большая");
    }
}




