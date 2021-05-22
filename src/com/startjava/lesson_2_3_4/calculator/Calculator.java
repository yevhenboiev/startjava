package com.startjava.lesson_2_3_4.calculator;

public class Calculator {

    private String mathExpression;
    private int firstNumber;
    private String sign;
    private int secondNumber;

    public int calculate(String mathExpression) {
        this.mathExpression = mathExpression;
        splitExpression();
        switch (sign) {
            case "+" :
                return firstNumber + secondNumber;
            case "-" :
                return firstNumber - secondNumber;
            case "*" :
                return firstNumber * secondNumber;
            case "/" :
                return firstNumber / secondNumber;
            case "%" :
                return firstNumber % secondNumber;
            case "^" :
                return (int) (Math.pow(firstNumber, secondNumber));
        }
        return 0;
    }

    private void splitExpression() {
        String[] arrayMathExpression = mathExpression.split(" ");
        firstNumber = Integer.parseInt(arrayMathExpression[0]);
        sign = arrayMathExpression[1];
        secondNumber = Integer.parseInt(arrayMathExpression[2]);
    }
}