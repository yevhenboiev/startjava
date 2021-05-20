package com.startjava.lesson_2_3_4.jaeger;

public class JaegerTest {
    
    public static void main(String[] args) {
        Jaeger gipsy = new Jaeger("Gipsy Danger", "Mark-3", "USA", "July 10, 2017", 79.25f, 1.98f, 7, 8, 6);
        gipsy.kill();
        gipsy.defend();
        gipsy.move();
        System.out.println("=============================================================");
        System.out.println("Моя модель: " + gipsy.getModel());
        System.out.println("Мой прототип: " + gipsy.getMark());
        System.out.println("Я произведен в : " + gipsy.getOrigin() + " " + gipsy.getLaunched());
        System.out.println("Моя высота " + gipsy.getHeight() + " метров");
        System.out.println("Мой вес: " + gipsy.getWeight() + " тонны");
        System.out.println("Моя скорость: " + gipsy.getSpeed());
        System.out.println("Моя сила: " + gipsy.getStrength());
        System.out.println("Моя броня: " + gipsy.getArmor());
        System.out.println("=============================================================");

        Jaeger cherno = new Jaeger("Cherno Alpha", "Mark-1", "Russia", "2015", 85.34f, 2.41f, 3, 10, 10);
        cherno.kill();
        cherno.defend();
        cherno.move();
        System.out.println("=============================================================");
        System.out.println("Моя модель: " + cherno.getModel());
        System.out.println("Мой прототип: " + cherno.getMark());
        System.out.println("Я произведен в : " + cherno.getOrigin() + " " + cherno.getLaunched());
        System.out.println("Моя высота " + cherno.getHeight() + " метров");
        System.out.println("Мой вес: " + cherno.getWeight() + " тонны");
        System.out.println("Моя скорость: " + cherno.getSpeed());
        System.out.println("Моя сила: " + cherno.getStrength());
        System.out.println("Моя броня: " + cherno.getArmor());
        System.out.println("=============================================================");

    }
}