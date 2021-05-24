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

    public void start() {
        randomNumber = (int) (Math.random() * 100 + 1);
        while (true) {
            if (makeMove(firstPlayer)) {
                break;
            }
            if (makeMove(secondPlayer)) {
                break;
            }
        }
        System.out.println("=================================================================");
        outputNumbers(firstPlayer);
        outputNumbers(secondPlayer);
    }

    private boolean checkCount(Player player) {
        return player.getCount() >= 10;
    }

    private void inputNumber(Player player) {
        System.out.print("Игрок " + player.getName() + " введите ваше число: ");
        player.setAttempt(console.nextInt());
    }

    private boolean checkNumber(Player player) {
        int numberPlayer = player.getAttempts()[player.getCount() - 1];
        if (numberPlayer == randomNumber) {
            System.out.println("Игрок " + player.getName() + " вы угадали число с " + player.getCount() +
                    " попытки");
            return true;
        }
        String checkResult = numberPlayer > randomNumber ? " больше, " : " меньше, ";
        System.out.println(player.getName() + checkResult + "чем загадал компьютер");
        return false;
    }

    private boolean makeMove(Player player) {
        if (checkCount(player)) {
            System.out.println(player.getName() + " у вас закончились попытки!");
            return true;
        }
        inputNumber(player);
        if (checkNumber(player)) {
            return true;
        }
        System.out.println("=================================================================");
        return false;
    }

    private void outputNumbers(Player player) {
        System.out.print(player.getName() + " все ваши числа: ");
        for (int number : player.getAttempts()) {
            System.out.print(number + " ");
        }
        System.out.println();
        player.nullifyNumbers();
    }
}