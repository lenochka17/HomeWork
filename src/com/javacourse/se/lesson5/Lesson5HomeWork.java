package com.javacourse.se.lesson5;

public class Lesson5HomeWork {
    public static void main(String[] args) {
        Person[] persArray = new Person[5];
        persArray[0] = new Person("Ivanov Ivan", "Manager", "ivanov@gmail.com", "89456328756", 100000, 55);
        persArray[1] = new Person("Petrov Victor", "Doctor", "petr10@yandex.ru", "89234571297", 70000, 38);
        persArray[2] = new Person("Sidorova Anna", "Nurse", "annasid@mail.ru", "89653421984", 35000, 28);
        persArray[3] = new Person("Yakovlev Dmitriy", "Repairer", "dmit18@gmail.com", "89763284532", 45000, 45);
        persArray[4] = new Person("Semenova Larisa", "Cleaner", "selar34@yandex.ru", "89237544323", 20000, 35);
        for (int i = 0; i < 5; i++) {
            if (persArray[i].getAge() > 40) {
                System.out.println(persArray[i]);
            }
        }
    }
}

class Person {
    private String name;
    private String position;
    private String email;
    private String phone;
    private int salary;
    private int age;

    Person(String name, String position, String email, String phone, int salary, int age) {
        this.name = name;
        this.position = position;
        this.email = email;
        this.phone = phone;
        this.salary = salary;
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return name + ", " + position + ", " + email + ", " + phone + ", " + salary + ", " + age;
    }
}