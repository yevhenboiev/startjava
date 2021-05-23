package com.startjava.lesson_2_3_4.game;

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

    private void inputNumber(Player player) {
        System.out.print("Игрок " + player.getName() + " введите ваше число: ");
        player.setAttempts(console.nextInt());
        player.setCount(1);
    }

    private boolean checkNumber(Player player) {
        if (player.getAttempts()[player.getCount() - 1] == randomNumber) {
            System.out.println("Игрок " + player.getName() + " вы угадали число с " + player.getCount() +
                    " попытки");
            return true;
        }
        String checkResult = player.getAttempts()[player.getCount() - 1] > randomNumber ? " больше, " : " меньше, ";
        System.out.println(player.getName() + checkResult + "чем загадал компьютер");
        return false;
    }

    private boolean checkCount(Player player) {
        if (player.getCount() < 10) {
            return false;
        } else {
            System.out.println(player.getName() + " у вас закончились попытки!");
            return true;
        }
    }

    private void outputNumbers(Player player) {
        System.out.print(player.getName() + " все ваши числа: ");
        for (int i = 0; i < player.getCount(); i++) {
            System.out.print(player.getAttempts()[i] + " ");
        }
        System.out.println();
        player.nullifyNumbers();
    }

    public void start() {
        randomNumber = (int) (Math.random() * 100);
        while (true) {
            if (checkCount(firstPlayer)) {
                break;
            }
            inputNumber(firstPlayer);
            inputNumber(secondPlayer);
            if (checkNumber(firstPlayer)) {
                break;
            }
            if (checkNumber(secondPlayer)) {
                break;
            }
            System.out.println("=================================================================");
        }
        outputNumbers(firstPlayer);
        outputNumbers(secondPlayer);
    }
}