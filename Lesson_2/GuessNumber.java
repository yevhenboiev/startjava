import java.util.Scanner;

public class GuessNumber {

    private Player playerFirst;
    private Player playerSecond;
    private int randomNumber;
    private boolean winnerDetected;

    Scanner console = new Scanner(System.in);

    public GuessNumber(Player playerFirst, Player playerSecond) {
        this.playerFirst = playerFirst;
        this.playerSecond = playerSecond;
    }

    public void startGame() {
        randomNumber = (int) (Math.random()*100);
        System.out.println("Вам предстоить угадать число от 0 до 100");
        while(true) {
            inputNumber(playerFirst);
            checkNumber(playerFirst);
            if(winnerDetected) {
                break;
            }
            inputNumber(playerSecond);
            checkNumber(playerSecond);
            if(winnerDetected) {
                break;
            }
        }
    }

    public void inputNumber(Player player) {
        System.out.println(player.getName() + " введите ваше число:");
        player.setNumber(console.nextInt());
    }
    
    public void checkNumber(Player player) {
        if (player.getNumber() < randomNumber) {
            System.out.println(player.getName() + " Ваше число меньше загаданного!");
        } else if (player.getNumber() > randomNumber) {
            System.out.println(player.getName() + " Ваше число больше загаданного!");
        } else {
            System.out.println(player.getName() + " Вы победили!");
            winnerDetected = true;
        }
    }
}