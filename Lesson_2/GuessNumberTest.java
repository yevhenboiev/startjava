import java.util.Scanner;

public class GuessNumberTest {
    
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("Добро пожаловать в игру \"Угадай число\"");
        System.out.println("Введите имя Первого игрока:");
        Player playerFirst = new Player(console.next());
        System.out.println("Введите имя Второго игрока:");
        Player playerSecond = new Player(console.next());
        String reply = "";
        do {
            GuessNumber game = new GuessNumber(playerFirst, playerSecond);
            game.startGame();
            do {
                System.out.println("Хотите продолжить игру? [yes/no]:");
                reply = console.next();
            } while (!reply.equals("yes") && !reply.equals("no"));
        } while (reply.equals("yes"));
        System.out.println("До скорых встреч!");
    }
}