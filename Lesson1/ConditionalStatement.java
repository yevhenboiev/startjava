public class Cycle {
    public static void main(String[] args) {
        int age = 22;
        if (age > 20) {
            System.out.println("Вы призывного возраста");
        }

        boolean isMan = true;
        if (isMan) {
            System.out.println("По первым половым признакам, вы нам подходите");
        } else {
            System.out.println("Вы не подходите для службы в армии");
        }

        double height = 1.68;
        if (height < 1.80) {
            System.out.println("Вы переросток");
        } else {
            System.out.println("Вы карлик");
        }
        
        char firstLatter = 'M';
        if (firstLatter == 'M') {
            System.out.println("Скорее всего вас зовут \"Max\"");
        } else if (firstLatter == 'I') {
            System.out.println("Скорее всего вас зовут \"Ildar\"");
        } else {
            System.out.println("Я не могу угадать ваше имя");
        }

    }
}