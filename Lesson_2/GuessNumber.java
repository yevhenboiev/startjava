import java.util.Scanner;

public class GuessNumber {

    private Player firstPlayer;
    private Player secondPlayer;
    private int randomNumber;

    Scanner console = new Scanner(System.in);

    public GuessNumber(Player firstPlayer, Player secondPlayer) {
        this.firstPlayer = firstPlayer;
        this.secondPlayer = secondPlayer;
    }

    public void start() {
        randomNumber = (int) (Math.random() * 100);
        System.out.println("Вам предстоить угадать число от 0 до 100");
        while (true) {
            inputNumber(firstPlayer);
            if (!checkNumber(firstPlayer)) {
                break;
            }
            inputNumber(secondPlayer);
            if (!checkNumber(secondPlayer)) {
                break;
            }
        }
    }

    private void inputNumber(Player player) {
        System.out.println(player.getName() + " введите ваше число:");
        player.setNumber(console.nextInt());
    }
    
    private boolean checkNumber(Player player) {
        if (player.getNumber() < randomNumber) {
            System.out.println(player.getName() + " Ваше число меньше загаданного!");
        } else if (player.getNumber() > randomNumber) {
            System.out.println(player.getName() + " Ваше число больше загаданного!");
        } else {
            System.out.println(player.getName() + " Вы победили!");
            return false;
        }
        return true;
    }
}