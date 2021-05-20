package com.startjava.lesson_2_3_4.calculator;

public class Calculator {

    private String mathExpression;
    private String[] arrayMathExpression;
    private int firstNumber;
    private String sign;
    private int secondNumber;

    public Calculator(String mathExpression) {
        this.mathExpression = mathExpression;
    }

    public void mathExpression() {
        arrayMathExpression = mathExpression.split(" ");
        firstNumber = Integer.parseInt(arrayMathExpression[0]);
        sign = arrayMathExpression[1];
        secondNumber = Integer.parseInt(arrayMathExpression[2]);
    }

    public void calculate() {
        int result = 0;
        switch (sign) {
            case "+" :
                result = firstNumber + secondNumber;
                break;
            case "-" :
                result = firstNumber - secondNumber;
                break;
            case "*" :
                result = firstNumber * secondNumber;
                break;
            case "/" :
                result = firstNumber / secondNumber;
                break;
            case "%" :
                result = firstNumber % secondNumber;
                break;
            case "^" :
                result = (int) (Math.pow(firstNumber, secondNumber));
                }
        System.out.println("Ваше выражение = " + result);
        }
}