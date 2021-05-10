public class GuessTheNumber {
    public static void main(String[] args) {
    int randomNumber = 10;
    int myNumber;

    for(int i = 0; i <= randomNumber; i++) {
        myNumber = i;
            if(randomNumber == myNumber) {
                System.out.println("Поздравляю, число угадано!");
                continue;
            } else if(randomNumber < myNumber) {
                System.out.println("Данное число больше того, что загадал компьютер");
            } else if(randomNumber > myNumber) {
                System.out.println("Данное число меньше того, что загадал компьютер");
            }
        }
    }
}