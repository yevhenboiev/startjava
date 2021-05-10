public class GuessNumber {
    public static void main(String[] args) {
        int randomNumber = 10;
        int myNumber;

        for (int i = 0; i <= randomNumber; i++) {
            myNumber = i;
            if (myNumber == randomNumber) {
                System.out.println("Поздравляю, число угадано!");
                break;
            } else if (myNumber < randomNumber) {
                System.out.println("Данное число больше того, что загадал компьютер");
            } else if (myNumber > randomNumber) {
                System.out.println("Данное число меньше того, что загадал компьютер");
            }
        }
    }
}