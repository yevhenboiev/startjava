package com.startjava.lesson_2_3_4.game;

import java.util.Arrays;

public class Player {
    private String name;
    private int[] attempts = new int[10];
    private int count;

    public String getName() {
        return name;
    }

    public Player(String name) {
        this.name = name;
    }

    public int[] getAttempts() {
        return Arrays.copyOf(attempts, attempts.length);
    }

    public void setAttempts(int number) {
        this.attempts[count] = number;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count += count;
    }

    public void nullifyNumbers() {
        Arrays.fill(attempts, 0, count, 0);
        count = 0;
    }
}
