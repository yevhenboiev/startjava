package com.startjava.lesson_2.calculator;

public class Calculator {

    private char sign;
    private int firstNumber;
    private int secondNumber;
    
    public void setFirstNumber(int firstNumber) {;
        this.firstNumber = firstNumber;
    }

    public void setSign(char sign) {
        this.sign = sign;
    }

    public void setSecondNumber(int secondNumber) {
        this.secondNumber = secondNumber;
    }

    public void calculate() {
        int result = 0;
        switch (sign) {
            case '+' :
                result = firstNumber + secondNumber;
                break;
            case '-' :
                result = firstNumber - secondNumber;
                break;
            case '*' :
                result = firstNumber * secondNumber;
                break;
            case '/' :
                result = firstNumber / secondNumber;
                break;
            case '%' :
                result = firstNumber % secondNumber;
                break;
            case '^' :
                result = 1;
                for (int i = 0; i < secondNumber; i++) {
                    result *= firstNumber;
                }
        }
        System.out.println("Ваше выражение = " + result);
    }
}