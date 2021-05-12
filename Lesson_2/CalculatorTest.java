import java.util.Scanner;

public class CalculatorTest {
    
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        Calculator calculator = new Calculator();
        System.out.println("Добро пожаловать в калькулятор");
        String reply = "yes";
        while (reply.equals("yes")) {
            System.out.println("Введите первое число:");
            calculator.setFirstNumber(console.nextInt());
            System.out.println("Введите знак математической операции");
            System.out.println("+ - сложить");
            System.out.println("- - вычесть");
            System.out.println("* - умножить");
            System.out.println("/ - разделить");
            System.out.println("% - найти процент от деления");
            System.out.println("^ - возвезти в степень");
            calculator.setSign(console.next().charAt(0));
            System.out.println("Введите второе число:");
            calculator.setSecondNumber(console.nextInt());
            calculator.calculate();
            do {
                System.out.println("Хотите продолжить вычисления? [yes/no]:");
                reply = console.next();
            } while (!reply.equals("yes") && !reply.equals("no"));
        }
        System.out.println("До скорых встреч!");
    }
}