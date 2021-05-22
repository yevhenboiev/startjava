package com.startjava.lesson_2_3_4.game;

import java.util.Scanner;

public class GuessNumberTest {

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("Добро пожаловать в игру \"Угадай число\"");
        System.out.print("Введите имя Первого игрока:");
        Player firstPlayer = new Player(console.next());
        System.out.print("Введите имя Второго игрока:");
        Player secondPlayer = new Player(console.next());
        System.out.println("У вас есть 10 попыток!");
        String reply;
        do {
            GuessNumber game = new GuessNumber(firstPlayer, secondPlayer);
            game.start();
            game.end();
            do {
                System.out.println("Хотите продолжить игру? [yes/no]:");
                reply = console.next();
            } while (!reply.equals("yes") && !reply.equals("no"));
        } while (reply.equals("yes"));
        System.out.println("До скорых встреч!");
    }
}
