public class WolfTest {
    public static void main(String[] args) {
        Wolf one = new Wolf();
        one.name = "Барсик";
        one.sex = "Кабель";
        one.color = "Черный";
        one.age = 2;
        one.weight = 30;
        one.sit();
        one.move();
        one.run();
        one.howl();
        one.hunt();
        System.out.println("Меня зовут: " + one.name);
        System.out.println("Мой пол: " + one.sex);
        System.out.println("Моя окрас: " + one.color);
        System.out.println("Мой возраст: " + one.age);
        System.out.println("Мой вес: " + one.weight);
    }
}