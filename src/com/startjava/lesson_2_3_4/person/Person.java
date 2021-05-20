package com.startjava.lesson_2_3_4.person;

public class Person {
    String name = "Саша";
    String sex = "Мужской";
    double height = 1.80;
    int weight = 72;
    int age = 24;

    public void move() {
        System.out.println("Я могу ходить");
    }

    public void sit() {
        System.out.println("Я могу сидеть");
    }

    public void run() {
        System.out.println("Я могу бегать");
    }

    public void speak() {
        System.out.println("Я могу говорить");
    }

    public void learnJava() {
        System.out.println("Я могу учить Java");
    }
}