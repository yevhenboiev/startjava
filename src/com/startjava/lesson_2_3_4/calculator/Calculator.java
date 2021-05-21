package com.startjava.lesson_2_3_4.calculator;

import java.util.Scanner;

public class Calculator {

    private int firstNumber;
    private String sign;
    private int secondNumber;

    Scanner console = new Scanner(System.in);

    public Calculator() {
        splitExpression(console.nextLine());
        System.out.println(calculate());
    }

    private int calculate() {
        return switch (sign) {
            case "+" -> firstNumber + secondNumber;
            case "-" -> firstNumber - secondNumber;
            case "*" -> firstNumber * secondNumber;
            case "/" -> firstNumber / secondNumber;
            case "%" -> firstNumber % secondNumber;
            case "^" -> (int) (Math.pow(firstNumber, secondNumber));
            default -> 0;
        };
    }

    private void splitExpression(String mathExpression) {
        String[] arrayMathExpression = mathExpression.split(" ");
        firstNumber = Integer.parseInt(arrayMathExpression[0]);
        sign = arrayMathExpression[1];
        secondNumber = Integer.parseInt(arrayMathExpression[2]);
    }
}