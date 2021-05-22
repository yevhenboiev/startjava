package com.startjava.lesson_2_3_4.game;

import java.util.Arrays;

public class Player {

    private String name;
    private int number;
    private int[] allNumber = new int[10];
    private int count = 0;

    public Player(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
        allNumber[count] = number;
    }

    public int[] getAllNumber() {
        return allNumber;
    }

    public void nullifyAll() {
        Arrays.fill(allNumber, 0, count, 0);
        count = 0;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count += count;
    }
}