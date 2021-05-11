public class Calculator {

    char sign;
    int firstNumber;
    int secondNumber;
    int result;

    public void calculate() {
        switch (sign) {
            case '+' :
                result = firstNumber + secondNumber;
                System.out.println("Ваше выражение = " + result);
                break;
            case '-' :
                result = firstNumber - secondNumber;
                System.out.println("Ваше выражение = " + result);
                break;
            case '*' :
                result = firstNumber * secondNumber;
                System.out.println("Ваше выражение = " + result);
                break;
            case '/' :
                result = firstNumber / secondNumber;
                System.out.println("Ваше выражение = " + result);
                break;
            case '%' :
                result = firstNumber % secondNumber;
                System.out.println("Ваше выражение = " + result);
                break;
            case '^' :
                result = 1;
                for (int i = 0; i < secondNumber; i++) {
                    result *= firstNumber;
                }
                System.out.println("Ваше выражение = " + result);
        }
    }
}