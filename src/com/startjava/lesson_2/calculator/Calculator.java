package com.startjava.lesson_2.calculator;

public class Calculator {

    private String mathExpression;
    private String[] arrayMathExpression;
    private int firstNumber;
    private String sign;
    private int secondNumber;

    public void setMathExpression(String mathExpression) {
        this.mathExpression = mathExpression;
    }

    public void setArrayMathExpression() {
        arrayMathExpression = mathExpression.split(" ");
    }

    public void setFirstNumber() {
        firstNumber = Integer.parseInt(arrayMathExpression[0]);
    }

    public void setSign() {
        sign = arrayMathExpression[1];
    }

    public void setSecondNumber() {
        secondNumber = Integer.parseInt(arrayMathExpression[2]);
    }

    public int calculate() {
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
        return result;
        }
}