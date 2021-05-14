import java.util.Scanner;

public class GuessNumberTest {
    
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("Добро пожаловать в игру \"Угадай число\"");
        System.out.println("Введите имя Первого игрока:");
        Player onePlayer = new Player(console.next());
        System.out.println("Введите имя Второго игрока:");
        Player twoPlayer = new Player(console.next());
        String reply = "yes";
        while (reply.equals("yes")) {
            GuessNumber game = new GuessNumber(onePlayer.getName(), twoPlayer.getName());
            do {
                System.out.println("Хотите продолжить игру? [yes/no]:");
                reply = console.next();
            } while (!reply.equals("yes") && !reply.equals("no"));
        }
        System.out.println("До скорых встреч!");
    }
}