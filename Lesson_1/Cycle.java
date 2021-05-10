public class Cycle {
    public static void main(String[] args) {
        System.out.println("Выводим числа от 0 до 20:");
        for(int i = 0; i <= 20; i++) {
            System.out.println(i);
        }

        System.out.println("Выводим числа от 6 до -6 с шагом интерации \"2\"");
        int i = 6;
        while(i >= -6) {
            System.out.println(i);
            i -= 2;
        }

        System.out.println("Считаем сумму четных чисел от 10 до 20");
        int sum = 0;
        int b = 10;
        do {
            if(b % 2 == 0) { 
                sum += b;
            }
            b++;
        } while(b <= 20);
        System.out.println(sum);
    }
}