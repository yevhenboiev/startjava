import java.util.Scanner;

public class CalculatorTest {

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        Calculator calculator = new Calculator();
        boolean returned = true;
        System.out.println("Добро пожаловать в калькулятор");
        while (returned) {
            System.out.println("Введите первое число:");
            calculator.firstNumber = console.nextInt();
            System.out.println("Введите знак математической операции");
            System.out.println("+ - сложить");
            System.out.println("- - вычесть");
            System.out.println("* - умножить");
            System.out.println("/ - разделить");
            System.out.println("% - найти процент от деления");
            System.out.println("^ - возвезти в степень");
            calculator.sign = console.next().charAt(0);
            System.out.println("Введите второе число:");
            calculator.secondNumber = console.nextInt();
            calculator.calculate();
            String reply;
            do {
                System.out.println("Хотите продолжить вычисления? [yes/no]:");
                reply = console.nextLine();
            } while (!reply.equals("yes") && !reply.equals("no"));
            if (reply.equals("no")) {
                returned = false;
            }
        }
        System.out.println("До скорых встреч!");
    }
}