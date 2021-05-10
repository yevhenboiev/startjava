import java.util.Scanner;

public class CalculatorTest {
    
    public static void main(String[] args) {
        Calculator one = new Calculator();
        System.out.println("Добро пожаловать в калькулятор");
        String repeat = "yes";
        Scanner console = new Scanner(System.in);
        while (repeat.equals("yes")) {
                one.setFirstNumber();
                one.setSign();
                one.setSecondNumber();
                one.setResult();
                System.out.println("Ваше выражение = " + one.getResult());
                System.out.println("Хотите продолжить вычисления? [yes/no]:");
                repeat = console.nextLine();
        }
        System.out.println("До скорых встреч!");
    }
}