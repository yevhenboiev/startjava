package com.startjava.lesson_2_3_4.calculator;

import java.util.Scanner;

public class CalculatorTest {

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("Добро пожаловать в калькулятор");
        String reply;
        do {
            System.out.print("Введите математическое выражение(Пример: \"2 + 3\"): ");
            Calculator calculator = new Calculator();
            do {
                System.out.print("Хотите продолжить вычисления? [yes/no]:");
                reply = console.next();
            } while (!reply.equals("yes") && !reply.equals("no"));
        } while (reply.equals("yes"));
        System.out.println("До скорых встреч!");
    }
}