import java.util.Scanner;

public class GuessNumber {

    private int randomNumber;
    private String playerOne;
    private String playerTwo;
    int number;

    public GuessNumber(String playerOne, String playerTwo) {
        Scanner console = new Scanner(System.in);
        this.playerOne = playerOne;
        this.playerTwo = playerTwo;
        randomNumber = (int) (Math.random()*100);
        while (true) {
            System.out.println(playerOne + " введите ваше число:");
            number = console.nextInt();
            if (number < randomNumber) {
                System.out.println("Ваше число меньше загаданного!");
            } else if (number> randomNumber) {
                System.out.println("Ваше число больше загаданного!");
            } else {
                System.out.println(playerOne + " вы угадали!");
                break;
            }
            System.out.println(playerTwo + " введите ваше число:");
            number = console.nextInt();
            if (number < randomNumber) {
                System.out.println("Ваше число меньше загаданного!");
            } else if (number > randomNumber) {
                System.out.println("Ваше число больше загаданного!");
            } else {
                System.out.println(playerTwo + " вы угадали!");
                break;
            }
        }
    }
}