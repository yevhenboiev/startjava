package com.startjava.lesson_2_3_4.game;

import java.util.Scanner;

public class GuessNumberTest {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("Добро пожаловать в игру \"Угадай число\"");
        System.out.println("\tПравила игры: " +
                "\n\t\t1. У вас есть 10 попыток" +
                "\n\t\t2. Вы должны угадать число в диапазоне \"0-100\"");
        System.out.println("=================================================================");
        System.out.print("Игрок под №1 введите ваше имя: ");
        Player firstPlayer = new Player(console.nextLine());
        System.out.print("Игрок под №2 введите ваше имя: ");
        Player secondPlayer = new Player(console.nextLine());
        System.out.println("Игроки " + firstPlayer.getName() + " и " + secondPlayer.getName() + " игра начинается!");
        System.out.println("=================================================================");
        GuessNumber game = new GuessNumber(firstPlayer, secondPlayer);
        String replace;
        do {
            game.start();
            do {
                System.out.print("Продолжить игру?[yes/no]: ");
                replace = console.next();
            } while (!replace.equals("yes") && !replace.equals("no"));
        } while (replace.equals("yes"));
        System.out.println("До скорых встреч!");
    }
}
