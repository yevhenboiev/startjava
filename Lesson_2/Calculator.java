import java.util.Scanner;

public class Calculator {

    private char sign;
    private int firstNumber;
    private int secondNumber;
    private int result;

    Scanner console = new Scanner(System.in);

    // public int getFirstNumber() {
    //     return firstNumber;
    // }

    public void setFirstNumber() {
        System.out.println("Введите первое число:");
        firstNumber = console.nextInt();
    }

    // public char getSign() {
    //     return sign;
    // }

    public void setSign() {
        System.out.println("Введите знак математической операции");
        System.out.println("+ - сложить");
        System.out.println("- - вычесть");
        System.out.println("* - умножить");
        System.out.println("/ - разделить");
        System.out.println("% - найти процент от деления");
        System.out.println("^ - возвезти в степень");
        sign = console.next().charAt(0);
    }

    // public int getSecondNumber() {
    //     return secondNumber
    // }
    
    public void setSecondNumber() {
        System.out.println("Введите второе число:");
        secondNumber = console.nextInt();
    }

    public int getResult() {
        return result;
    }

    public void setResult() {
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
                break;
        }
    }
}