import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        System.out.println("Добро пожаловать в калькулятор положительных и целых чисел!");
        System.out.println("Введите первое положительное число");
        int firstNumber = console.nextInt();
        //firstNumber = 1;
        if (firstNumber > 0) {
            System.out.println("Ваше число: " + firstNumber);
        } else {
            System.out.println("Вы ввели отрицательное число! Повторите попытку");
        }

        System.out.println("Что вы хотите сделать с первым числом?");
        System.out.println("* - умножить\n/ - разделить\n+ - сложить\n- - вычесть\n% - найти процент от деления\n^ - возвезти в степень");
        char sign = console.next().charAt(0);
        //sign = '+';
        if (sign == '*' || sign == '/' || sign == '+' || sign == '-' || sign == '%' || sign == '^') {
            System.out.println("Вы ввели знак " + sign);
        } else {
            System.out.println("К сожалению, мы не знаем такого знака. Повторите попытку");
        }

        System.out.println("Введите второе положительное число");
        int secondNumber = console.nextInt();
        //secondNumber = 2;
        if (secondNumber > 0) {
            System.out.println("Ваше число: " + secondNumber);
        } else {
            System.out.println("Вы ввели отрицательное число! Повторите попытку");
        }

        if (sign == '*') {
            int result = firstNumber * secondNumber;
            System.out.println("Ваше выражение равно " + result);
        } else if (sign == '/') {
            int result = firstNumber / secondNumber;
            System.out.println("Ваше выражение равно " + result);
        } else if (sign == '+') {
            int result = firstNumber + secondNumber;
            System.out.println("Ваше выражение равно " + result);
        } else if (sign == '-') {
            int result = firstNumber - secondNumber;
            System.out.println("Ваше выражение равно " + result);
        } else if (sign == '%') {
            int result = firstNumber % secondNumber;
            System.out.println("Ваше выражение равно " + result);
        } else if (sign == '^') {
            int result = 1;
            for (int i = 1; i <= secondNumber; i++) {
                result *= firstNumber;
            }
            System.out.println("Ваше выражение равно " + result);
        }
    }
}