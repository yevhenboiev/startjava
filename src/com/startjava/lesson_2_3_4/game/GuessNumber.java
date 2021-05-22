package com.startjava.lesson_2_3_4.game;

import java.util.Arrays;
import java.util.Scanner;

public class GuessNumber {

    private Player firstPlayer;
    private Player secondPlayer;
    private int randomNumber;

    Scanner console = new Scanner(System.in);

    public GuessNumber(Player firstPlayer, Player secondPlayer) {
        this.firstPlayer = firstPlayer;
        this.secondPlayer = secondPlayer;
    }

    public void start() {
        randomNumber = (int) (Math.random() * 100);
        System.out.println("Вам предстоить угадать число от 0 до 100");
        while (true) {
            inputNumber(firstPlayer);
            if (checkNumber(firstPlayer)) {
                break;
            }
            inputNumber(secondPlayer);
            if (checkNumber(secondPlayer)) {
                break;
            }
        }
    }

    public void end() {
        outNumber(firstPlayer);
        outNumber(secondPlayer);
    }

    private void inputNumber(Player player) {
        System.out.print(player.getName() + " введите ваше число:");
        player.setNumber(console.nextInt());
    }

    private boolean checkNumber(Player player) {
        if (player.getCount() < 10) {
            if (player.getNumber() < randomNumber) {
                player.setCount(1);
                System.out.println(player.getName() + " Ваше число меньше загаданного!");
            } else if (player.getNumber() > randomNumber) {
                player.setCount(1);
                System.out.println(player.getName() + " Ваше число больше загаданного!");
            } else {
                player.setCount(1);
                System.out.println("Игрок " + player.getName() + " угадал число " + randomNumber
                        + " c " + player.getCount() + " попытки!");
                return true;
            }
        } else {
            System.out.println("У " + player.getName() + " закончились попытки");
            return false;
        }
        return false;
    }

    public void outNumber(Player player) {
        int[] allNumberCount = Arrays.copyOf(player.getAllNumber(), player.getCount());
        System.out.println(player.getName() + " ваши числа: " + Arrays.toString(allNumberCount));
        player.nullifyAll();
    }
}